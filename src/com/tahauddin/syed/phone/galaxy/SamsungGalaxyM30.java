package com.tahauddin.syed.phone.galaxy;

import com.tahauddin.syed.core.Samsung;
import com.tahauddin.syed.phone.core.SamsungGalaxySeries;

public class SamsungGalaxyM30 implements SamsungGalaxySeries {

    public SamsungGalaxyM30() {
        System.out.println("Samsung Galaxy M30 Product :: Object Created..");
    }

    @Override
    public Samsung getSamsungProduct(String name) {
        return this;
    }

    public final void createPhone(){
        getParts();
        assembleProduct();
        getAccessories();
        labelBrand();
        packProduct();
        System.out.println("Phone Created :: " + this);
    }

    @Override
    public Boolean getParts() {
        System.out.println("Getting Parts..:: Galaxy M30");
        return Boolean.TRUE;
    }

    @Override
    public Boolean assembleProduct() {
        System.out.println("Assembling Product..:: Galaxy M30");
        return Boolean.TRUE;
    }

    @Override
    public Boolean getAccessories() {
        System.out.println("Getting Accessories..:: Galaxy M30");
        return Boolean.TRUE;
    }

    @Override
    public Boolean labelBrand() {
        System.out.println("Marking Brand..:: Galaxy M30");
        return Boolean.TRUE;
    }

    @Override
    public Boolean packProduct() {
        System.out.println("Packing Product:: Galaxy M30");
        return Boolean.TRUE;
    }
}
