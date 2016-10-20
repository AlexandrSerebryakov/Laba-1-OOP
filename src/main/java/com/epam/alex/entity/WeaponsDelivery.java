package com.epam.alex.entity;

import org.joda.money.Money;

/**
 * Created by Alexandr Serebryakov on 14.10.2016.
 */
public class WeaponsDelivery {

    private int idNumber;
    private String name;
    private String vendorCode;
    private boolean lobby;
    private Money currencyAndCost;
    private String originCountry;
    private double length;
    private double width;
    private double height;
    private double weight;


    public WeaponsDelivery(int idNumber, String name, String vendorCode, boolean lobby,
                           Money currencyAndCost, String originCountry, double length, double width, double height, double weight) {
        this.idNumber = idNumber;
        this.name = name;
        this.vendorCode = vendorCode;
        this.lobby = lobby;
        this.currencyAndCost = currencyAndCost;
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

    public Money getCurrencyAndCost() {
        return currencyAndCost;
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
