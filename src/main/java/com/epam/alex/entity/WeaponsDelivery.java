package com.epam.alex.entity;

/**
 * Created by user on 14.10.2016.
 */
public class WeaponsDelivery {
    private int idNumber;
    private String name;
    private String vendorCode;
    private boolean lobby;
    private String currency;
    private double cost;
    private String originCountry;
    private double length;
    private double width;
    private double height;
    private double weight;



    public WeaponsDelivery(int idNumber, String name, String vendorCode, boolean lobby, String currency,
                           int cost, String originCountry, double length, double width, double height, double weight) {
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



}
