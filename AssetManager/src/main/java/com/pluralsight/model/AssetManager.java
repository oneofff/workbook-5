package com.pluralsight.model;// AssetManager.java
import java.util.ArrayList;

public class AssetManager {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();

        assets.add(new House(
            "My vacation home",
            "2020-06-15",
            350_000,
            "123 Lakeview Dr",
            1,      // excellent
            2000,
            5000
        ));

        assets.add(new House(
            "City condo",
            "2018-09-01",
            220_000,
            "456 Maple St, Apt 8",
            2,      // good
            850,
            0
        ));

        assets.add(new Vehicle(
            "Tom's truck",
            "2019-03-22",
            45_000,
            "Ford F-150",
            2019,
            85_000
        ));

        assets.add(new Vehicle(
            "My Honda Civic",
            "2015-11-05",
            20_000,
            "Honda Civic LX",
            2015,
            120_000
        ));

        for (Asset asset : assets) {
            System.out.printf("Description: %s\n", asset.getDescription());
            System.out.printf(" Acquired:   %s\n", asset.getDateAcquired());
            System.out.printf(" Cost paid:  $%.2f\n", asset.getOriginalCost());
            System.out.printf(" Current value: $%.2f\n", asset.getValue());

            if (asset instanceof House) {
                House h = (House) asset;
                System.out.printf(" Address:    %s\n", h.getAddress());
            } else if (asset instanceof Vehicle) {
                Vehicle v = (Vehicle) asset;
                System.out.printf(" Vehicle:    %d %s\n", v.getYear(), v.getMakeModel());
            }
            System.out.println();
        }
    }
}
