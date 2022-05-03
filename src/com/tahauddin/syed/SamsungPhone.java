package com.tahauddin.syed;

public class SamsungPhone implements Samsung{

    private static SamsungPhone INSTANCE = new SamsungPhone();

    private SamsungPhone(){
        System.out.println("0 Param Constructor :: Samsung Phone");
    }

    public static Samsung getInstance(){
        return INSTANCE;
    }


}
