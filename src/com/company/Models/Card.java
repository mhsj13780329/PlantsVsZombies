package com.company.Models;

import java.util.ArrayList;

public class Card {
    private ArrayList<Card> cards;
    private int health;
    private int damage;
    private int price;
    private int coordinateX;
    private int coordinateY;
    private int coolDown;
    private String name;
    private boolean isWater;
    private boolean isPlant;

    public boolean isPlant() {
        return isPlant;
    }

    public void setPlant(boolean plant) {
        isPlant = plant;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }

    public int getCoolDown() {
        return coolDown;
    }

    public void setCoolDown(int coolDown) {
        this.coolDown = coolDown;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isWater() {
        return isWater;
    }

    public void setWater(boolean water) {
        isWater = water;
    }

    public Card getCardByName(String name){
        Card result = null;
        for (Card card :
                cards) {
            if (card.name.equals(name))
                result = card;
        }
        return result;
    }
}
