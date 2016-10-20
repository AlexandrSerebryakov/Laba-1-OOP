package com.epam.alex.entity;

import org.joda.money.CurrencyUnit;
import org.joda.money.Money;

/**
 * Created by Alexandr Serebryakov on 14.10.2016.
 */
public class WeaponryOutfit extends Weaponry{
    public WeaponryOutfit(int idNumber, String name, String vendorCode, boolean lobby, CurrencyUnit currency, Money cost,
                          String originCountry, double length, double width, double height, double weight) {
        super(idNumber, name, vendorCode, lobby, currency, cost, originCountry, length, width, height, weight);
    }
}
