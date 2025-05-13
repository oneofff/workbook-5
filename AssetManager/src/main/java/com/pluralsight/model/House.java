package com.pluralsight.model;// House.java
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class House extends Asset {
    private String address;
    private int condition;   // 1-excellent, 2-good, 3-fair, 4-poor
    private int squareFoot;
    private int lotSize;

    public House(String description,
                 String dateAcquired,
                 double originalCost,
                 String address,
                 int condition,
                 int squareFoot,
                 int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address     = address;
        this.condition   = condition;
        this.squareFoot  = squareFoot;
        this.lotSize     = lotSize;
    }

    @Override
    public double getValue() {
        double rate = switch (condition) {
            case 1 -> 180;
            case 2 -> 130;
            case 3 -> 90;
            case 4 -> 80;
            default -> 0;
        };
        return squareFoot * rate + lotSize * 0.25;
    }
}
