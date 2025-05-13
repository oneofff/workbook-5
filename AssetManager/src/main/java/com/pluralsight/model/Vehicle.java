package com.pluralsight.model;// Vehicle.java
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description,
                   String dateAcquired,
                   double originalCost,
                   String makeModel,
                   int year,
                   int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year      = year;
        this.odometer  = odometer;
    }

    @Override
    public double getValue() {
        int age = java.time.Year.now().getValue() - year;
        double value;
        if (age <= 3) {
            value = getOriginalCost() * Math.pow(0.97, age);
        } else if (age <= 6) {
            value = getOriginalCost() * Math.pow(0.94, age);
        } else if (age <= 10) {
            value = getOriginalCost() * Math.pow(0.92, age);
        } else {
            value = 1000.0;
        }
        // mileage penalty
        if (odometer > 100_000
            && !makeModel.toLowerCase().contains("honda")
            && !makeModel.toLowerCase().contains("toyota")) {
            value *= 0.75;
        }
        return value;
    }
}
