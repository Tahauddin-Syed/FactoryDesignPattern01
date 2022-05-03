package com.tahauddin.syed;

import com.tahauddin.syed.core.Samsung;
import com.tahauddin.syed.factory.SamsungFactory;
import com.tahauddin.syed.phone.galaxy.SamsungGalaxyM30;
import com.tahauddin.syed.phone.note.SamsungGalaxyNote10;

import static com.tahauddin.syed.core.AllConstants.*;
import static com.tahauddin.syed.phone.constant.PhoneModelNames.GALAXY_M30;
import static com.tahauddin.syed.phone.constant.PhoneModelNames.NOTE_10;
import static com.tahauddin.syed.tv.constant.TVModelNames.*;

public class App {

    public static void main(String[] args) {

        Samsung samsungPhone = SamsungFactory.getSamsungObject(SAMSUNG_PHONE);
        System.out.println(samsungPhone.getClass().getName());

        Samsung samsungTV = SamsungFactory.getSamsungObject(SAMSUNG_TV);
        System.out.println(samsungTV.getClass().getName());

        Samsung samsungWM = SamsungFactory.getSamsungObject(SAMSUNG_WASHING_MACHINE);
        System.out.println(samsungWM.getClass().getName());

        Samsung samsungGalaxyM30 = samsungPhone.getSamsungProduct(GALAXY_M30);
        System.out.println(samsungGalaxyM30.getClass().getName());

        Samsung samsung30InchLEDTV = samsungTV.getSamsungProduct(LED_30_INCHES);
        System.out.println(samsung30InchLEDTV.getClass().getName());

        Samsung samsung60InchLEDTV = samsungTV.getSamsungProduct(LED_60_INCHES);
        System.out.println(samsung60InchLEDTV.getClass().getName());


        SamsungGalaxyM30 galaxyM30 = SamsungGalaxyM30.class.cast(samsungGalaxyM30);
        galaxyM30.createPhone();

        Samsung samsungNote10Phone = samsungPhone.getSamsungProduct(NOTE_10);
        SamsungGalaxyNote10 samsungNote10 = SamsungGalaxyNote10.class.cast(samsungNote10Phone);
        samsungNote10.createPhone();
    }
}
