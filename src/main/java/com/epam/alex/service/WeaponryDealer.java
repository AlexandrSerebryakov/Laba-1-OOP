package com.epam.alex.service;

import com.epam.alex.entity.WeaponsDelivery;
import org.joda.money.Money;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import static org.joda.money.CurrencyUnit.*;

/**
 * Created by Alexandr Serebryakov on 12.10.2016.
 */
public class WeaponryDealer {


    public WeaponryDealer() {
        List<WeaponsDelivery> weaponsDeliveries = new ArrayList<>();
        weaponsDeliveries.addAll
                (Arrays.asList(
                        new WeaponsDelivery(1, "Tank", "T123", true, Money.of(USD, 120000), Locale.US, 3.24, 2.34, 7.33, 6300),
                        new WeaponsDelivery(2, "Tank", "T002", true, Money.of(USD, 120000), Locale.FRANCE, 3.55, 2.34, 2.63, 7450),
                        new WeaponsDelivery(3, "Helicopter", "H005", false, Money.of(GBP, 120000), Locale.CANADA, 3.7, 2.45, 4.31, 5400),
                        new WeaponsDelivery(4, "Helicopter", "H088", true, Money.of(EUR, 120000), Locale.CHINA, 3.4, 2.87, 9.77, 2890),
                        new WeaponsDelivery(5, "Aircraft", "A745", true, Money.of(CHF, 120000), Locale.GERMANY, 30, 3, 6.33, 12000)));


    }
}


