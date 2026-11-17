package com.pluralsight;

import java.math.BigDecimal;
import java.util.ArrayList;

public class AssetApp {
    public static void main(String[] args) {

        //Add arrayList
        ArrayList<Asset> assets = new ArrayList<Asset>();

        //Make 2 houses. Regular house, pent house

        House myHouse = new House("2 Bedroom", "10/10/26", new BigDecimal("100000.00"),
                "1212 S Harlem Way", 1, 100, 5000);

        House pentHouse = new House("Pent House", "05/02/2025", new BigDecimal("200000.00"),
                "2121 N Houston Ave", 1, 800, 200);

        //Make 2 cars. Regular , fancy
        Vehicle regularVehicle = new Vehicle("Suv", "08/15/2025", new BigDecimal("30000.00"),
                "Ford Explorer", 2024, 10000);

        Vehicle fancyVehicle = new Vehicle("Sports Car", "03/07/2026", new BigDecimal("148000.00"),
                "Nissan GT-R Nismo", 2026, 0);

        assets.add(myHouse);
        assets.add(pentHouse);
        assets.add(regularVehicle);
        assets.add(fancyVehicle);

        //Make for loop to list through assets
        for (Asset asset : assets) {

            //Add instanceof to detect what type of asset it is
            String message;
            if (asset instanceof House house) {
                message = "House at " + house.getAddress();
            } else if (asset instanceof Vehicle vehicle) {
                message = "Vehicle " + vehicle.getYear() + " " + vehicle.getMakeModel();
            } else {
                message = "Unknown Asset ";
            }

            //Display house address or vehicle info
            System.out.println(message);

            System.out.println("----------------------------");

                System.out.println("Description: " + asset.getDescription());

                System.out.println("Date Acquired: " + asset.getDateAcquired());

                System.out.println("Original Cost: $" + asset.getOriginalCost());

                System.out.println("Current Value: $" + asset.getValue());

                System.out.println("----------------------------");


            }


        }
    }

