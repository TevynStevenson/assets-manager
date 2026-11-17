package com.pluralsight;

import java.math.BigDecimal;

public class Vehicle extends Asset {

    private String makeModel;
    int year;
    int odometer;

    //Add constructor for vehicle, super to add Asset properties to class
    public Vehicle(String description, String dateAcquired, BigDecimal originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;

    }

    //Getter/setter for MakeModel
    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    //Getter/setter for year
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //Getter/setter for odometer
    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public BigDecimal getValue() {

        BigDecimal value = getOriginalCost();

        int age = 2026 - getYear();

        if (age >= 0 && age <= 3) {

            //Add bigDecimal formula
            BigDecimal depreciation = getOriginalCost().multiply(new BigDecimal(".03")).multiply(new BigDecimal(age));

            value = getOriginalCost().subtract(depreciation);

        } else if (age >= 4 && age <= 6) {
            //Add depreciation
            BigDecimal depreciation = new BigDecimal("0.06").multiply(new BigDecimal(age));

            value = getOriginalCost().subtract(depreciation);

        } else if (age >= 7 && age <= 10) {
            //Add depreciation
            BigDecimal depreciation = new BigDecimal("0.08").multiply(new BigDecimal(age));

            value = getOriginalCost().subtract(depreciation);

        } else if (age > 10) {
            value = new BigDecimal(1000);

            value = getOriginalCost().subtract(value);

        } if (!getMakeModel().contains("Honda") && !getMakeModel().contains("Toyota")
                && getOdometer() > 100000) {

            BigDecimal depreciation = new BigDecimal(".25").multiply(getOriginalCost());

            value = value.multiply(new BigDecimal(".75"));
        }
        return value;
    }
}
