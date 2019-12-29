package com.company.Models;

public class RailGame {

    private Cell[][] cells;
    private Plant plant;
    private Player player;

    public void list(Player player){}

    public void plant(int x, int y){}

    public void remove(int x, int y){}

    public void endTurn(){}

    public void showLawn(){}

    public Cell[][] getCells() {
        return cells;
    }

    public void setCells(Cell[][] cells) {
        this.cells = cells;
    }

    public Plant getPlant() {
        return plant;
    }

    public void setPlant(Plant plant) {
        this.plant = plant;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
