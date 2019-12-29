package com.company.Models;

import java.util.ArrayList;

public class Player {
    int killedZombies;
    String userName;
    String password;
    ArrayList<Plant> boughtPlants;
    ArrayList<Zombie> boughtZombies;
    ArrayList<Plant> plantsHand;
    ArrayList<Zombie> zombiesHand;

    public int getKilledZombies() {
        return killedZombies;
    }

    public void setKilledZombies(int killedZombies) {
        this.killedZombies = killedZombies;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Plant> getBoughtPlants() {
        return boughtPlants;
    }

    public void setBoughtPlants(ArrayList<Plant> boughtPlants) {
        this.boughtPlants = boughtPlants;
    }

    public ArrayList<Zombie> getBoughtZombies() {
        return boughtZombies;
    }

    public void setBoughtZombies(ArrayList<Zombie> boughtZombies) {
        this.boughtZombies = boughtZombies;
    }

    public ArrayList<Plant> getPlantsHand() {
        return plantsHand;
    }

    public void setPlantsHand(ArrayList<Plant> plantsHand) {
        this.plantsHand = plantsHand;
    }

    public ArrayList<Zombie> getZombiesHand() {
        return zombiesHand;
    }

    public void setZombiesHand(ArrayList<Zombie> zombiesHand) {
        this.zombiesHand = zombiesHand;
    }
}
