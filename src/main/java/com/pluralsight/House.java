package com.pluralsight;

import java.math.BigDecimal;

public class House extends Asset {

    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    //Add constructor for house
    //Super to add Assests properties to this class
    public House(String description, String dateAcquired, BigDecimal originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    //Getter/setter for address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //Getter/setter for condition
    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    //Getter/setter for squarefoot
    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    //Getter/setter for lotSize
    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public BigDecimal getValue() {
        BigDecimal value = BigDecimal.ZERO;

        if (this.condition == 1) {
            value = new BigDecimal("180.00");
        } else if (this.condition == 2) {
            value = new BigDecimal("130.00");
        } else if (this.condition == 3) {
            value = new BigDecimal("90.00");
        } else if (this.condition == 4) {
            value = new BigDecimal("80.00");
        }

        value = value.multiply(BigDecimal.valueOf(squareFoot));

        value = value.add(BigDecimal.valueOf(lotSize).multiply(new BigDecimal("0.25")));

        return value;
    }

}
