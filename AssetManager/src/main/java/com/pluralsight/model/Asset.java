package com.pluralsight.model;// Asset.java
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Asset {
    private String description;
    private String dateAcquired;
    private double originalCost;

    public double getValue() {
        return originalCost;
    }
}
