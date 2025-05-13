package com.pluralsight.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@NoArgsConstructor
public class Moped extends Vehicle {
    private int engineDisplacement;
    private boolean electricStart;

    public Moped(String color,
                 int numberOfPassengers,
                 int cargoCapacity,
                 int fuelCapacity,
                 int engineDisplacement,
                 boolean electricStart) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.engineDisplacement = engineDisplacement;
        this.electricStart = electricStart;
    }

    public void popWheelie() {
        System.out.println("Popping a wheelie!");
    }
}
