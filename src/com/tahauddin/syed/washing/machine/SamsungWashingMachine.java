package com.tahauddin.syed.washing.machine;

import com.tahauddin.syed.core.Samsung;

public class SamsungWashingMachine implements Samsung {

    private static Samsung INSTANCE = new SamsungWashingMachine();

    private SamsungWashingMachine(){
        System.out.println("0 Param Constructor :: Samsung Washing Machine");
    }

    public static Samsung getInstance() {
        return INSTANCE;
    }

    @Override
    public Samsung getSamsungProduct(String name) {
        return null;
    }
}
