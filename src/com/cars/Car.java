package com.cars;

import java.util.ArrayList;
import java.util.HashMap;

public class Car {
    private String name;
    private int manufacturingYear;
    private HashMap<CarParts, String> parts = new HashMap<CarParts, String >();
    private Engine engine;
    private ArrayList<Tire> tires = new ArrayList<Tire>();

    public Car(String name, int manufacturingYear, Engine e) {
        this.name = name;
        this.manufacturingYear = manufacturingYear;
        this.engine = e;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getManufacturingYear() {
        return manufacturingYear;
    }

    public void setManufacturingYear(int manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    public void addPart(CarParts part, String desc) {
        parts.put(part, desc);
    }

    public String getPart(CarParts part) {
        return parts.get(part);
    }

    public void addTire(Tire tire) {
        tires.add(tire);
    }

    public ArrayList<Tire> getTires() {
        return this.tires;
    }

    public Engine getEngine() {
        return this.engine;
    }
}
