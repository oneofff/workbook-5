package com.pluralsight.model;

import lombok.*;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class Hovercraft extends Vehicle {
    private double maxHoverHeight;
    private double skirtHeight;

    public Hovercraft(String color,
                      int numberOfPassengers,
                      int cargoCapacity,
                      int fuelCapacity,
                      double maxHoverHeight,
                      double skirtHeight) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.maxHoverHeight  = maxHoverHeight;
        this.skirtHeight     = skirtHeight;
    }

    public void hover() {
        System.out.println("Hovering at up to " + maxHoverHeight +" skirt height " + skirtHeight);
    }
}
