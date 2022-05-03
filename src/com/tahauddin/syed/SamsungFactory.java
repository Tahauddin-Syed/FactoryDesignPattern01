package com.tahauddin.syed;

public abstract class SamsungFactory {

    public static Samsung getSamsungObject(String name){
        if(name.equalsIgnoreCase("SamsungPhone")){
            return SamsungPhone.getInstance();
        } else if(name.equalsIgnoreCase("SamsungTV")){
            return SamsungTV.getInstance();
        } else if(name.equalsIgnoreCase("SamsungWashingMachine")){
            return SamsungWashingMachine.getInstance();
        }
        else {
            throw new IllegalArgumentException("Object Not Found!!");
        }
    }
}
