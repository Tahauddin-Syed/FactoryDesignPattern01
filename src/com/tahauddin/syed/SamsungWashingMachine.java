package com.tahauddin.syed;

public class SamsungWashingMachine implements Samsung{

    private static Samsung INSTANCE = new SamsungWashingMachine();

    private SamsungWashingMachine(){
        System.out.println("0 Param Constructor :: Samsung Washing Machine");
    }





    public static Samsung getInstance() {
        return INSTANCE;
    }
}
