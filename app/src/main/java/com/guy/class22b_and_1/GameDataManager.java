package com.guy.class22b_and_1;

import java.util.ArrayList;

public class GameDataManager {


    public static ArrayList<Country> buildData() {
        ArrayList<Country> countries = new ArrayList<>();

        countries.add(new Country().setName("Australia").setCode("au").setPeace(true));
        countries.add(new Country().setName("Canada").setCode("ca").setPeace(true));
        countries.add(new Country().setName("China").setCode("cn").setPeace(false));
        countries.add(new Country().setName("Cuba").setCode("cu").setPeace(false));
        countries.add(new Country().setName("Germany").setCode("de").setPeace(false));
        countries.add(new Country().setName("Iraq").setCode("iq").setPeace(false));
        countries.add(new Country().setName("Japan").setCode("jp").setPeace(true));
        countries.add(new Country().setName("North Korea").setCode("kp").setPeace(false));
        countries.add(new Country().setName("Ukraine").setCode("ua").setPeace(true));
        countries.add(new Country().setName("United States").setCode("us").setPeace(true));

        return countries;
    }
}