package com.tahauddin.syed;

public abstract class SamsungFactory {

    public static Samsung getSamsungObject(String name){
        if(name.equalsIgnoreCase("SamsungPhone")){
            return new SamsungPhone();
        } else if(name.equalsIgnoreCase("SamsungTV")){
            return new SamsungTV();
        } else if(name.equalsIgnoreCase("SamsungWashingMachine")){
            return new SamsungWashingMachine();
        }
        else {
            throw new IllegalArgumentException("Object Not Found!!");
        }
    }
}
