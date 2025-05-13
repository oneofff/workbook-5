package com.pluralsight.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Vehicle {
    private String color;
    private int numberOfPassengers;
    private int cargoCapacity;
    private int fuelCapacity;
}
