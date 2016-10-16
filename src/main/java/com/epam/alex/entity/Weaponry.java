package com.epam.alex.entity;

/**
 * Created by user on 12.10.2016.
 */
public class Weaponry extends WeaponsDelivery {
    private String idNumber;
    private String name;
    private String vendorCode;
    private String lobby;
    private String currency;
    private String cost;
    private String originCountry;
    private String length;
    private String width;
    private String height;
    private String weight;

    /*public Weaponry(getIdNumber(), String name, String vendorCode, boolean lobby, String currency, double cost, String originCountry, double length, double width, double height, double weight ) {
    }*/
    public Weaponry(String idNumber, String name, String vendorCode, String lobby, String currency,
                    String cost, String originCountry, String length, String width, String height, String weight) {
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

    /*public Weaponry(getIdNumber(), String tank, String t123, String s1, String currency, String s2, String originCountry, String s3, String s4, String s5, String s6) {
        super();
    }*/

    public String getIdNumber() {
        return idNumber;
    }

    public String getName() {
        return name;
    }

    public String getVendorCode() {
        return vendorCode;
    }

    public String isLobby() {
        return lobby;
    }

    public String getCurrency() {
        return currency;
    }

    public String getCost() {
        return cost;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public String getLength() {
        return length;
    }

    public String getWidth() {
        return width;
    }

    public String getHeight() {
        return height;
    }

    public String getWeight() {
        return weight;
    }


}
