package com.company.Models;

public class Shot {
    int damage;
    boolean isSun;
    boolean isProjectile;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public boolean isSun() {
        return isSun;
    }

    public void setSun(boolean sun) {
        isSun = sun;
    }

    public boolean isProjectile() {
        return isProjectile;
    }

    public void setProjectile(boolean projectile) {
        isProjectile = projectile;
    }
}
