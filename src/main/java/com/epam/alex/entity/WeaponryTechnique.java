package com.epam.alex.entity;

import org.joda.money.CurrencyUnit;
import org.joda.money.Money;

/**
 * Created by Alexandr Serebryakov on 12.10.2016.
 */
public class WeaponryTechnique extends Weaponry {


    public WeaponryTechnique(int idNumber, String name, String vendorCode, boolean lobby, CurrencyUnit currency, Money cost,
                             String originCountry, double length, double width, double height, double weight) {
        super(idNumber, name, vendorCode, lobby, currency, cost, originCountry, length, width, height, weight);
    }
}
