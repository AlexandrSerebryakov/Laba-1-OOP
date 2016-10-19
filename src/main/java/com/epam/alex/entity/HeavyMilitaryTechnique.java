package com.epam.alex.entity;

import org.joda.money.Money;

/**
 * Created by user on 12.10.2016.
 */
public class HeavyMilitaryTechnique extends WeaponryTechnique {
    public HeavyMilitaryTechnique(int idNumber, String name, String vendorCode, boolean lobby, String currency, Money cost, String originCountry, double length, double width, double height, double weight) {
        super(idNumber, name, vendorCode, lobby, currency, cost, originCountry, length, width, height, weight);
    }
}
