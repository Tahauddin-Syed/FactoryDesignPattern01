package com.tahauddin.syed.phone.galaxy;

import com.tahauddin.syed.core.Samsung;
import com.tahauddin.syed.core.SamsungCreateTemplateImpl;
import com.tahauddin.syed.phone.core.SamsungGalaxySeries;

public class SamsungGalaxyM15 extends SamsungCreateTemplateImpl implements SamsungGalaxySeries {

    @Override
    public Samsung getSamsungProduct(String name) {
        return this;
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
        System.out.println("Marking Brand..:: Galaxy M15");
        return Boolean.TRUE;
    }

    @Override
    public Boolean packProduct() {
        System.out.println("Packing Product..:: Galaxy M15");
        return Boolean.TRUE;
    }
}
