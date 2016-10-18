package com.epam.alex.service;

import com.epam.alex.entity.Weaponry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by user on 12.10.2016.
 */
public class WeaponryDealer {

    private List<Weaponry> weaponsDeliveries;


    public List<Weaponry> getWeaponsDeliveries() {
        return weaponsDeliveries;
    }

    public WeaponryDealer() {
        List<Weaponry> weaponsDeliveries = new ArrayList<>();
        weaponsDeliveries.addAll(Arrays.asList(new Weaponry(1, "Tank", "T123", true, "USD", 120000, "USA", 3.24, 2.34, 7.33, 6300),
                                               new Weaponry(2, "Tank", "T002", true, "USD", 235000, "USA", 3.55, 2.34, 2.63, 7450),
                                               new Weaponry(3, "Helicopter", "H005", false, "USD", 85000, "USA", 3.7, 2.45, 4.31, 5400),
                                               new Weaponry(4, "Helicopter", "H088", true, "USD", 74500, "USA", 3.4, 2.87, 9.77, 2890),
                                               new Weaponry(5, "Aircraft", "A745", true, "USD", 564200, "USA", 30, 3, 6.33, 12000)));
        {


        }

    }
}


