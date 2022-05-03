package com.tahauddin.syed.phone;

import com.tahauddin.syed.core.Samsung;

public class SamsungPhone implements Samsung {

    private static SamsungPhone INSTANCE = new SamsungPhone();

    protected SamsungPhone(){
        System.out.println("0 Param Constructor :: Samsung Phone");
    }



    public static Samsung getInstance(){
        return INSTANCE;
    }


}
