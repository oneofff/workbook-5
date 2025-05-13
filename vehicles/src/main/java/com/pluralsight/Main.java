package com.pluralsight;

import com.pluralsight.model.Car;
import com.pluralsight.model.Hovercraft;
import com.pluralsight.model.Moped;
import com.pluralsight.model.SemiTruck;

public class Main {
    public static void main(String[] args) {
        Moped slowRide = new Moped("Red", 1, 0, 5, 50, true);
        System.out.println(slowRide);
        slowRide.popWheelie();

        Car familyWagon = new Car("Blue", 5, 500, 50, 4, true);
        System.out.println(familyWagon);
        familyWagon.openTrunk();

        SemiTruck bigRig = new SemiTruck("White", 2, 20000, 300, 2, true);
        System.out.println(bigRig);
        bigRig.attachTrailer();
        bigRig.detachTrailer();

        Hovercraft hoverX = new Hovercraft("Silver", 8, 2000, 80, 3.5, 30.0);
        System.out.println(hoverX);
        hoverX.hover();

    }
}