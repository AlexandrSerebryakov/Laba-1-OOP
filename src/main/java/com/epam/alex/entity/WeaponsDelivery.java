package com.epam.alex.entity;

/**
 * Created by user on 14.10.2016.
 */
public class WeaponsDelivery {
    private int id;
    private String name;
    private String vendorCode;
    private boolean lobby;
    private float purchasePrice;
    private float sellingPrice;
    private String OriginCountry;
    private int length;
    private int width;
    private int height;
    private int weight;

    public WeaponsDelivery(int id, String name, String vendorCode, boolean lobby, float purchasePrice,
                           float sellingPrice, String originCountry, int length, int width, int height, int weight) {
        this.id = id;
        this.name = name;
        this.vendorCode = vendorCode;
        this.lobby = lobby;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
        OriginCountry = originCountry;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }
}
