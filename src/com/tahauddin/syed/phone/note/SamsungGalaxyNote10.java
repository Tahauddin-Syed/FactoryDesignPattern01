package com.tahauddin.syed.phone.note;

import com.tahauddin.syed.core.Samsung;
import com.tahauddin.syed.core.SamsungCreateTemplateImpl;
import com.tahauddin.syed.phone.core.SamsungGalaxySeries;

public class SamsungGalaxyNote10 extends SamsungCreateTemplateImpl implements SamsungGalaxySeries {

    public SamsungGalaxyNote10(){
        if(!createPhone()){
            System.out.println("Could Not Create Note 10 Phone");
            throw new IllegalArgumentException("Some Parametor Missing");
        }
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
        return Boolean.FALSE;
    }

    @Override
    public Boolean packProduct() {
        System.out.println("Packing Product..:: Note 10");
        return Boolean.TRUE;
    }
}
