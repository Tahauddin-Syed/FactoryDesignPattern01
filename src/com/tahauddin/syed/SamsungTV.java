package com.tahauddin.syed;

public class SamsungTV implements Samsung{

    private static Samsung INSTANCE = new SamsungTV();

    private SamsungTV(){
        System.out.println("0 Param Constructor :: Samsung TV");
    }


    public static Samsung getInstance() {
        return INSTANCE;
    }
}
