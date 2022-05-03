package com.tahauddin.syed.tv.led;

import com.tahauddin.syed.core.Samsung;
import com.tahauddin.syed.core.SamsungCreateTemplateImpl;
import com.tahauddin.syed.tv.core.SamsungLEDTV;

public class Samsung50nchLEDTV extends SamsungCreateTemplateImpl implements SamsungLEDTV  {

    public Samsung50nchLEDTV() {
        System.out.println("Samsung LED TV 50 Inches");
    }

    @Override
    public Samsung getSamsungProduct(String name) {
        return this;
    }

    @Override
    public Boolean getParts() {
        System.out.println("Getting Parts..:: Samsung 50 Inches LED TV");
        return Boolean.TRUE;
    }

    @Override
    public Boolean assembleProduct() {
        System.out.println("Getting Parts..:: Samsung 50 Inches LED TV");
        return Boolean.TRUE;
    }

    @Override
    public Boolean getAccessories() {
        System.out.println("Getting Parts..:: Samsung 50 Inches LED TV");
        return Boolean.TRUE;
    }

    @Override
    public Boolean labelBrand() {
        System.out.println("Getting Parts..:: Samsung 50 Inches LED TV");
        return Boolean.TRUE;
    }

    @Override
    public Boolean packProduct() {
        System.out.println("Getting Parts..:: Samsung 50 Inches LED TV");
        return Boolean.TRUE;
    }
}
