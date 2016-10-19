package com.epam.alex.entity;

import org.joda.money.Money;

/**
 * Created by user on 14.10.2016.
 */
public class WeaponsDelivery {

    private int idNumber;
    private String name;
    private String vendorCode;
    private boolean lobby;
    private String currency;
    private Money cost;
    private String originCountry;
    private double length;
    private double width;
    private double height;
    private double weight;


    public WeaponsDelivery(int idNumber, String name, String vendorCode, boolean lobby, String currency,
                           Money cost, String originCountry, double length, double width, double height, double weight) {
        this.idNumber = idNumber;
        this.name = name;
        this.vendorCode = vendorCode;
        this.lobby = lobby;
        this.currency = currency;
        this.cost = cost;
        this.originCountry = originCountry;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }




    public int getIdNumber() {
        return idNumber;
    }

    public String getName() {
        return name;
    }

    public String getVendorCode() {
        return vendorCode;
    }

    public boolean isLobby() {
        return lobby;
    }

    public String getCurrency() {
        return currency;
    }

    public Money getCost() {
        return cost;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }



}
