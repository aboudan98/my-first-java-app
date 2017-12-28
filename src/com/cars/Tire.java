package com.cars;

public class Tire {
    private String position;
    private String manufacturer;
    private double radius;
    private double maxPressure;

    public Tire(String position, String manufacturer, double radius, double maxPressure) {
        this.position = position;
        this.manufacturer = manufacturer;
        this.radius = radius;
        this.maxPressure = maxPressure;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getMaxPressure() {
        return maxPressure;
    }

    public void setMaxPressure(double maxPressure) {
        this.maxPressure = maxPressure;
    }
}
