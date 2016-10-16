package com.epam.alex.service;

import com.epam.alex.entity.WeaponsDelivery;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 12.10.2016.
 */
public class WeaponryDealer {

    private List<WeaponsDelivery> technique;
    private String name;


    public WeaponryDealer(String name) {
        technique = new ArrayList<>();
        this.name = name;
    }

    public List<WeaponsDelivery> getWeaponsDelivery(){

        List<WeaponsDelivery> vehicles = new ArrayList<>();
        vehicles.addAll(technique);

        return vehicles;
    }
}
