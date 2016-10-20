package com.epam.alex.service;

import com.epam.alex.entity.WeaponsDelivery;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.joda.money.CurrencyUnit.*;


/**
 * Created by Alexandr Serebryakov on 12.10.2016.
 */
public class WeaponryDealer {


    public WeaponryDealer() {
        List<WeaponsDelivery> weaponsDeliveries = new ArrayList<>();
        weaponsDeliveries.addAll(Arrays.asList(new WeaponsDelivery(1, "Tank", "T123", true, USD, null, "USA", 3.24, 2.34, 7.33, 6300),
                                               new WeaponsDelivery(2, "Tank", "T002", true, USD, null, "USA", 3.55, 2.34, 2.63, 7450),
                                               new WeaponsDelivery(3, "Helicopter", "H005", false, EUR, null, "USA", 3.7, 2.45, 4.31, 5400),
                                               new WeaponsDelivery(4, "Helicopter", "H088", true, EUR, null, "USA", 3.4, 2.87, 9.77, 2890),
                                               new WeaponsDelivery(5, "Aircraft", "A745", true, GBP, null, "USA", 30, 3, 6.33, 12000)));




    }
}


