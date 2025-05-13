package com.pluralsight.model;

import lombok.*;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class SemiTruck extends Vehicle {
    private int trailerCount;
    private boolean hasSleeperCab;

    public SemiTruck(String color,
                     int numberOfPassengers,
                     int cargoCapacity,
                     int fuelCapacity,
                     int trailerCount,
                     boolean hasSleeperCab) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.trailerCount = trailerCount;
        this.hasSleeperCab = hasSleeperCab;
    }

    public void attachTrailer() {
        trailerCount++;
        System.out.println("Attached one trailer (total now: " + trailerCount + ").");
    }

    public void detachTrailer() {
        if (trailerCount > 0) {
            trailerCount--;
            System.out.println("Detached one trailer (total now: " + trailerCount + ").");
        } else {
            System.out.println("No trailers to detach!");
        }
    }
}
