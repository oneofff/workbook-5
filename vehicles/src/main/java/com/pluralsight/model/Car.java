package com.pluralsight.model;

import lombok.*;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class Car extends Vehicle {
    private int numberOfDoors;
    private boolean hasSunroof;

    public Car(String color,
               int numberOfPassengers,
               int cargoCapacity,
               int fuelCapacity,
               int numberOfDoors,
               boolean hasSunroof) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.numberOfDoors = numberOfDoors;
        this.hasSunroof    = hasSunroof;
    }

    public void openTrunk() {
        System.out.println("Trunk is now open.");
    }

}
