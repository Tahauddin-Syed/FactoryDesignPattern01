package com.tahauddin.syed;

import com.tahauddin.syed.core.Samsung;
import com.tahauddin.syed.factory.SamsungFactory;

public class App {

    public static void main(String[] args) {

        Samsung samsungPhone = SamsungFactory.getSamsungObject("samsungPhone");
        System.out.println(samsungPhone.getClass().getName());

        Samsung samsungTV = SamsungFactory.getSamsungObject("SamsungTV");
        System.out.println(samsungTV.getClass().getName());

        Samsung samsungWM = SamsungFactory.getSamsungObject("SamsungWashingMachine");
        System.out.println(samsungWM.getClass().getName());

        Samsung samsungGalaxyM30 = samsungPhone.getSamsungProduct("M30");
        System.out.println(samsungGalaxyM30.getClass().getName());
    }
}
