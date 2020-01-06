package com.company.Models;

import com.company.View.View;

public class NormalGame {
    private Plant selectedPlant;
    private Cell[][] cells;
    private Player player;
    private int suns;
    private boolean[] hasLawnMower = {true, true, true, true, true, true};
    private int turn;
    private int sunsIncreasedTurn;
    private int turnsToIncreaseSuns;
    private boolean hasIncreasedSunsThePreviuosRound;

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }

    //constructor initialize suns
    public NormalGame(){
        this.suns = 2;
        this.sunsIncreasedTurn = 0;
        for (int i = 0; i < 18; i++) {
            for (int j = 0; j < 5; j++) {
                cells[i][j].setCard(null);
            }
        }
    }

    public Plant getSelectedPlant() {
        return selectedPlant;
    }

    public void setSelectedPlant(Plant selectedPlant) {
        this.selectedPlant = selectedPlant;
    }

    public Cell[][] getCells() {
        return cells;
    }

    public void setCells(Cell[][] cells) {
        this.cells = cells;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getSuns() {
        return suns;
    }

    public void setSuns(int suns) {
        this.suns = suns;
    }

    public boolean[] getHasLawnMower() {
        return hasLawnMower;
    }

    public void setHasLawnMower(boolean[] hasLawnMower) {
        this.hasLawnMower = hasLawnMower;
    }

    public void select(String name){
        for (Plant plant :
                player.getPlantsHand()) {
            if (name.equals(plant.getName()) && suns >= plant.getSuns() && plant.isActive()){
                setSelectedPlant(plant);
            }
        }
    }

    public void plant(int x, int y){
        if (y >= 0 && y <= 5 && x >= 0 && x <= 18 && x % 2 == 0){
            Cell selectedCell = cells[x][y];
            if (selectedCell.getCard() == null){
                selectedCell.setCard(selectedPlant);
                selectedPlant = null;
            } else {
                View.cellNotEmpty();
            }
        }
    }

    public void remove(int x, int y){
        if (y >= 0 && y <= 5 && x >= 0 && x <= 18){
            Cell selectedCell = cells[x][y];
            if (selectedCell.getCard() != null){
                selectedCell.setCard(null);
            } else {
                View.cellEmpty();
            }
        }
    }

    public void endTurn(){
        turn ++;
        if (turn == sunsIncreasedTurn + turnsToIncreaseSuns){
            increaseSuns();
        }
        for (int i = 0; i < 18; i++) {
            for (int j = 0; j < 5; j++) {
                Card card = cells[i][j].getCard();
                if (card != null){

                }
            }
        }
    }

    public void showHand(){
        for (Plant plant :
                player.getPlantsHand()) {
            System.out.println(plant.getName() + plant.getSuns() + "remaining rest time" + plant.getRemaningCoolDown());
        }
    }

    public void increaseSuns(){
        suns += (int)(Math.random() * 4) + 2;
        turnsToIncreaseSuns = (int)(Math.random() * 2) + 1;
    }

    public void showLawn(){
        for (int i = 0; i < 18; i++) {
            for (int j = 0; j < 5; j++) {
                Card card = cells[i][j].getCard();
                if (card != null){
                    System.out.println(card.getName() + "location: " + i + "," + j + card.getHealth());
                }
            }
        }
    }
}
