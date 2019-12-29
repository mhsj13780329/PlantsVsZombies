package com.company.Models;

public class Cell {
    private int coordinateX;
    private int coordinateY;
    private Card card;

    public Cell(int coordinateX, int coordinateY, Card card) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.card = card;
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

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
