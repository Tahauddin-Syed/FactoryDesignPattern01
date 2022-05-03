package com.tahauddin.syed.phone.core;

import com.tahauddin.syed.core.Samsung;
import com.tahauddin.syed.phone.galaxy.SamsungGalaxyM15;
import com.tahauddin.syed.phone.galaxy.SamsungGalaxyM30;
import com.tahauddin.syed.phone.galaxy.SamsungGalaxyM50;
import com.tahauddin.syed.phone.galaxy.SamsungGalaxyM20;
import com.tahauddin.syed.phone.note.SamsungGalaxyNote10;

import static com.tahauddin.syed.phone.constant.PhoneModelNames.*;

public class SamsungPhone implements Samsung {

    private static SamsungPhone INSTANCE = new SamsungPhone();

    protected SamsungPhone(){

        System.out.println("0 Param Constructor :: Samsung Phone");
    }

    public static Samsung getInstance(){
        return INSTANCE;
    }

    @Override
    public Samsung getSamsungProduct(String name){
        Samsung samsungPhone;
        if(name.equalsIgnoreCase(GALAXY_M15)){
            samsungPhone = new SamsungGalaxyM15();
            return samsungPhone;
        } else if(name.equalsIgnoreCase(GALAXY_M30)){
             samsungPhone = new SamsungGalaxyM30();
             return samsungPhone;
        } else if(name.equalsIgnoreCase(GALAXY_M50)){
             samsungPhone = new SamsungGalaxyM50();
            return samsungPhone;
        } else if(name.equalsIgnoreCase(GALAXY_M20)){
            samsungPhone = new SamsungGalaxyM20();
            return samsungPhone;
        } else if(name.equalsIgnoreCase(NOTE_10)) {
            samsungPhone = new SamsungGalaxyNote10();
            return samsungPhone;
        } else {
            throw new IllegalArgumentException("Samsung Phone Not Found!!");
        }
    }
}
