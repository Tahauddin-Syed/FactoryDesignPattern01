package com.tahauddin.syed;

import com.tahauddin.syed.core.Samsung;
import com.tahauddin.syed.factory.SamsungFactory;

import static com.tahauddin.syed.phone.constant.PhoneModelNames.GalaxyM30;
import static com.tahauddin.syed.tv.constant.TVModelNames.LED30INCHES;
import static com.tahauddin.syed.tv.constant.TVModelNames.LED60INCHES;

public class App {

    public static void main(String[] args) {

        Samsung samsungPhone = SamsungFactory.getSamsungObject("samsungPhone");
        System.out.println(samsungPhone.getClass().getName());

        Samsung samsungTV = SamsungFactory.getSamsungObject("SamsungTV");
        System.out.println(samsungTV.getClass().getName());

        Samsung samsungWM = SamsungFactory.getSamsungObject("SamsungWashingMachine");
        System.out.println(samsungWM.getClass().getName());

        Samsung samsungGalaxyM30 = samsungPhone.getSamsungProduct(GalaxyM30);
        System.out.println(samsungGalaxyM30.getClass().getName());

        Samsung samsung30InchLEDTV = samsungTV.getSamsungProduct(LED30INCHES);
        System.out.println(samsung30InchLEDTV.getClass().getName());

        Samsung samsung60InchLEDTV = samsungTV.getSamsungProduct(LED60INCHES);
        System.out.println(samsung60InchLEDTV.getClass().getName());
    }
}
