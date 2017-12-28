package com.cars;

public class Engine {
    private int horses;
    private int liters;

    public int getHorses() {
        return horses;
    }

    public void setHorses(int horses) {
        this.horses = horses;
    }

    public int getLiters() {
        return liters;
    }

    public void setLiters(int liters) {
        this.liters = liters;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    private double capacity;

    public Engine(int horses, int liters, double capacity) {
        this.horses = horses;
        this.liters = liters;
        this.capacity = capacity;
    }


}