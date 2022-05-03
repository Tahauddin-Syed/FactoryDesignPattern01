package com.tahauddin.syed.phone.note;

import com.tahauddin.syed.core.Samsung;
import com.tahauddin.syed.phone.core.SamsungGalaxySeries;

public class SamsungGalaxyNote10 implements SamsungGalaxySeries {

    public final void createPhone(){
        getParts();
        assembleProduct();
        getAccessories();
        labelBrand();
        packProduct();
        System.out.println("Phone Created :: " + this);
    }


    @Override
    public Samsung getSamsungProduct(String name) {
        return this;
    }

    @Override
    public Boolean getParts() {
        System.out.println("Getting Parts....:: Note 10");
        return Boolean.TRUE;
    }

    @Override
    public Boolean assembleProduct() {
        System.out.println("Getting Parts....:: Note 10");
        return Boolean.TRUE;
    }

    @Override
    public Boolean getAccessories() {
        System.out.println("Get Accessories..:: Note 10");
        return Boolean.TRUE;
    }

    @Override
    public Boolean labelBrand() {
        System.out.println("Marking Brand....:: Note 10");
        return Boolean.TRUE;
    }

    @Override
    public Boolean packProduct() {
        System.out.println("Packing Product..:: Note 10");
        return Boolean.TRUE;
    }
}
