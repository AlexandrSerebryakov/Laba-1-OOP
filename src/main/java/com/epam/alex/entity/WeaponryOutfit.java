package com.epam.alex.entity;

import org.joda.money.Money;

/**
 * Created by user on 14.10.2016.
 */
public class WeaponryOutfit extends Weaponry{
    public WeaponryOutfit(int idNumber, String name, String vendorCode, boolean lobby, String currency, Money cost, String originCountry, double length, double width, double height, double weight) {
        super(idNumber, name, vendorCode, lobby, currency, cost, originCountry, length, width, height, weight);
    }
}
