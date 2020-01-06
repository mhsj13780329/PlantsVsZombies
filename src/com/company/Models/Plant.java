package com.company.Models;

public class Plant extends Card {
    private int suns;
    private int turn;
    private int shotPerTurn;
    private int speedReduction;
    private int times;
    private boolean isMelee;
    private boolean isShy;
    private boolean hasForwardShooting;
    private boolean hasBackwardShooting;
    private boolean isActive;
    private boolean isSeaweed;
    private boolean isCat;
    private int remaningCoolDown;

    public int getRemaningCoolDown() {
        return remaningCoolDown;
    }

    public void setRemaningCoolDown(int remaningCoolDown) {
        this.remaningCoolDown = remaningCoolDown;
    }

    public int getSuns() {
        return suns;
    }

    public void setSuns(int suns) {
        this.suns = suns;
    }

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }

    public int getShotPerTurn() {
        return shotPerTurn;
    }

    public void setShotPerTurn(int shotPerTurn) {
        this.shotPerTurn = shotPerTurn;
    }

    public int getSpeedReduction() {
        return speedReduction;
    }

    public void setSpeedReduction(int speedReduction) {
        this.speedReduction = speedReduction;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    public boolean isMelee() {
        return isMelee;
    }

    public void setMelee(boolean melee) {
        isMelee = melee;
    }

    public boolean isShy() {
        return isShy;
    }

    public void setShy(boolean shy) {
        isShy = shy;
    }

    public boolean isHasForwardShooting() {
        return hasForwardShooting;
    }

    public void setHasForwardShooting(boolean hasForwardShooting) {
        this.hasForwardShooting = hasForwardShooting;
    }

    public boolean isHasBackwardShooting() {
        return hasBackwardShooting;
    }

    public void setHasBackwardShooting(boolean hasBackwardShooting) {
        this.hasBackwardShooting = hasBackwardShooting;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isSeaweed() {
        return isSeaweed;
    }

    public void setSeaweed(boolean seaweed) {
        this.isSeaweed = seaweed;
    }

    public boolean isCat() {
        return isCat;
    }

    public void setCat(boolean cat) {
        isCat = cat;
    }

    public void plantEndTrun(){

    }
}
