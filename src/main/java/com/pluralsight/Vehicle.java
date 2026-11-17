package com.pluralsight;

import java.math.BigDecimal;

public class Vehicle extends Asset{

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
}
