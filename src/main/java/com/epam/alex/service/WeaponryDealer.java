package com.epam.alex.service;

import com.epam.alex.entity.Weaponry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by user on 12.10.2016.
 */
public class WeaponryDealer {

    private List<Weaponry> weaponsDeliveries;


    public WeaponryDealer() {
        List<Weaponry> weaponsDeliveries = new ArrayList<>();
        weaponsDeliveries.addAll(Arrays.asList(new Weaponry("1", "", "", "", "", "", "", "", "", "", "")));
        {


        }

    }
}


