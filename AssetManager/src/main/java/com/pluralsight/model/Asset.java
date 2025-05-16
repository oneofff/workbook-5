package com.pluralsight.model;// Asset.java
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Asset {
    protected String description;
    private String dateAcquired;
    private double originalCost;

    public abstract double getValue();
}
