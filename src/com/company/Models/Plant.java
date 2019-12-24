package com.company.Models;

public class Plant extends Card {
    private int suns;
    private int turn;
    private int shotPerTurn;
    private int speedReduction;
    private int times;
    private boolean isMelee;
    private boolean isScarely;
    private boolean hasForwardShooting;
    private boolean hasBackwardShooting;
    private boolean isActive;
    private boolean idSeaweed;
    private boolean isCat;

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

    public boolean isScarely() {
        return isScarely;
    }

    public void setScarely(boolean scarely) {
        isScarely = scarely;
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

    public boolean isIdSeaweed() {
        return idSeaweed;
    }

    public void setIdSeaweed(boolean idSeaweed) {
        this.idSeaweed = idSeaweed;
    }

    public boolean isCat() {
        return isCat;
    }

    public void setCat(boolean cat) {
        isCat = cat;
    }
}
