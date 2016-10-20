package com.epam.alex.main;

import com.epam.alex.service.WeaponryDealer;

/**
 * Created by Alexandr on 09.10.2016.
 */
public class Runner {
    public static void main(String[] args) {
        WeaponryDealer weaponryDealer = new WeaponryDealer();
        System.out.println(weaponryDealer.toString());

    }
}
