package com.tahauddin.syed.tv.core;


import com.tahauddin.syed.core.Samsung;
import com.tahauddin.syed.tv.led.*;
import static com.tahauddin.syed.tv.constant.TVModelNames.*;

public class SamsungTV implements Samsung {

    private static Samsung INSTANCE = new SamsungTV();

    protected SamsungTV(){
        System.out.println("0 Param Constructor :: Samsung TV");
    }


    public static Samsung getInstance() {
        return INSTANCE;
    }

    @Override
    public Samsung getSamsungProduct(String name) {

        if(name.equalsIgnoreCase(LED_30_INCHES)){
            return new Samsung30InchLEDTV();
        } else if(name.equalsIgnoreCase(LED_40_INCHES)){
            return new Samsung40InchLEDTV();
        } else if(name.equalsIgnoreCase(LED_42_INCHES)){
            return new Samsung42InchLEDTV();
        } else if(name.equalsIgnoreCase(LED_45_INCHES)){
            return new Samsung45InchLEDTV();
        } else if(name.equalsIgnoreCase(LED_50_INCHES)){
            return new Samsung50nchLEDTV();
        } else if(name.equalsIgnoreCase(LED_60_INCHES)){
            return new Samsung60InchLEDTV();
        }
        else {
            throw new IllegalArgumentException("Samsung Phone Not Found!!");
        }
    }
}
