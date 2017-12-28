package com.cars;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<Car>();
        Car corolla = new Car("Corolla", 2012, new Engine(300, 3, 2.4));
        corolla.addPart(CarParts.Engine, "360 HP");
        corolla.addPart(CarParts.Tires, "4 Micheline Tires");
        corolla.addTire(new Tire("FR","Micheline", 3.4, 29.8));
        corolla.addTire(new Tire("FL","Micheline", 3.4, 29.8));
        corolla.addTire(new Tire("BR","Micheline", 3.4, 29.8));
        corolla.addTire(new Tire("BL","Micheline", 3.4, 29.8));
        corolla.addTire(new Tire("SPARE","Micheline", 3.4, 29.8));
        cars.add(corolla);

        for (Car car : cars) {
            System.out.println("Name: " + car.getName() + " - Year: " + car.getManufacturingYear() +
            " - tires: " + car.getTires().size() +
            " - engine size: " + car.getEngine().getCapacity());
        }


    }
}

