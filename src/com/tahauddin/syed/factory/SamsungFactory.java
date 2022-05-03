package com.tahauddin.syed.factory;

import com.tahauddin.syed.core.Samsung;
import com.tahauddin.syed.phone.core.SamsungPhone;
import com.tahauddin.syed.tv.core.SamsungTV;
import com.tahauddin.syed.washing.machine.core.SamsungWashingMachine;

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
