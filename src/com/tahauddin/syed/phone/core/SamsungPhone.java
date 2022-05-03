package com.tahauddin.syed.phone.core;

import com.tahauddin.syed.core.Samsung;
import com.tahauddin.syed.phone.galaxy.SamsungGalaxyM15;
import com.tahauddin.syed.phone.galaxy.SamsungGalaxyM30;
import com.tahauddin.syed.phone.galaxy.SamsungGalaxyM50;
import com.tahauddin.syed.phone.galaxy.SamsungGalsxyM20;
import com.tahauddin.syed.tv.SamsungTV;
import com.tahauddin.syed.washing.machine.SamsungWashingMachine;

public class SamsungPhone implements Samsung {

    private static SamsungPhone INSTANCE = new SamsungPhone();

    protected SamsungPhone(){
        System.out.println("0 Param Constructor :: Samsung Phone");
    }

    public static Samsung getInstance(){
        return INSTANCE;
    }


    public SamsungPhone getSamsungProduct(String name){
        if(name.equalsIgnoreCase("M15")){
            return new SamsungGalaxyM15();
        } else if(name.equalsIgnoreCase("M30")){
            return new SamsungGalaxyM30();
        } else if(name.equalsIgnoreCase("M50")){
            return new SamsungGalaxyM50();
        } else if(name.equalsIgnoreCase("M20")){
            return new SamsungGalsxyM20();
        }
        else {
            throw new IllegalArgumentException("Samsung Phone Not Found!!");
        }
    }


}
