package com.epam.alex.entity;

/**
 * Created by user on 12.10.2016.
 */
public abstract class Weaponry extends WeaponsDelivery {
    public Weaponry(int idNumber, String name, String vendorCode, boolean lobby, String currency, int cost, String originCountry, double length, double width, double height, double weight) {
        super(idNumber, name, vendorCode, lobby, currency, cost, originCountry, length, width, height, weight);
    }
}
