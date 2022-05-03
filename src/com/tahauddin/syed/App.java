package com.tahauddin.syed;

public class App {

    public static void main(String[] args) {

        Samsung samsungPhone = SamsungFactory.getSamsungObject("samsungPhone");
        System.out.println(samsungPhone.getClass().getName());

        Samsung samsungTV = SamsungFactory.getSamsungObject("SamsungTV");
        System.out.println(samsungTV.getClass().getName());

        Samsung samsungWM = SamsungFactory.getSamsungObject("SamsungWashingMachine");
        System.out.println(samsungWM.getClass().getName());

        Samsung otherObject = SamsungFactory.getSamsungObject("samsung");
        System.out.println(otherObject.getClass().getName());

    }
}
