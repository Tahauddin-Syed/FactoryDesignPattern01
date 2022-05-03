package com.tahauddin.syed.phone.galaxy;

import com.tahauddin.syed.core.Samsung;
import com.tahauddin.syed.phone.core.SamsungGalaxySeries;

public class SamsungGalaxyM15 implements SamsungGalaxySeries {

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
        System.out.println("Getting Parts..:: Galaxy M15");
        return Boolean.TRUE;
    }

    @Override
    public Boolean assembleProduct() {
        System.out.println("Assembling Product..:: Galaxy M15");
        return Boolean.TRUE;
    }

    @Override
    public Boolean getAccessories() {
        System.out.println("Getting Accessories..:: Galaxy M15");
        return Boolean.TRUE;
    }

    @Override
    public Boolean labelBrand() {
        System.out.println("Marking Branch..:: Galaxy M15");
        return Boolean.TRUE;
    }

    @Override
    public Boolean packProduct() {
        System.out.println("Packing Product..:: Galaxy M15");
        return Boolean.TRUE;
    }
}
