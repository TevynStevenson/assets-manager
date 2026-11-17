package com.pluralsight;

import java.math.BigDecimal;

public class Asset {

    //Add variables for description, dateAcquired, and originalCost
    private String description;
    private String dateAcquired;
    private BigDecimal originalCost;

    //Add constructor for Assets (description, dateAcquired, originalCost
    public Asset(String description, String dateAcquired, BigDecimal originalCost) {
        this.description = description;
        this.dateAcquired = dateAcquired;
        this.originalCost = originalCost;
    }

    //Getter/Setter for description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //Getter/setter for date
    public String getDateAcquired() {
        return dateAcquired;
    }

    public void setDateAcquired(String dateAcquired) {
        this.dateAcquired = dateAcquired;
    }

    //Getter/setter for cost
    public BigDecimal getOriginalCost() {
        return originalCost;
    }

    public void setOriginalCost(BigDecimal originalCost) {
        this.originalCost = originalCost;
    }

    public BigDecimal getValue(){
        return this.originalCost;
    }
}
