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
    private int sellingPrice;
    private String originCountry;
    private int length;
    private int width;
    private int height;
    private int weight;



    public WeaponsDelivery(int idNumber, String name, String vendorCode, boolean lobby, String currency,
                           int sellingPrice, String originCountry, int length, int width, int height, int weight) {
        this.idNumber = idNumber;
        this.name = name;
        this.vendorCode = vendorCode;
        this.lobby = lobby;
        this.currency = currency;
        this.sellingPrice = sellingPrice;
        this.originCountry = originCountry;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }



}
