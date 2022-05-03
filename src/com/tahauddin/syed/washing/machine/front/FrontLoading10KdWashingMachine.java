package com.tahauddin.syed.washing.machine.front;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.tahauddin.syed.core.Samsung;
import com.tahauddin.syed.core.SamsungCreateTemplateImpl;
import com.tahauddin.syed.washing.machine.core.FrontLoadingWashingMachine;

import static java.lang.Boolean.TRUE;

public class FrontLoading10KdWashingMachine extends SamsungCreateTemplateImpl implements FrontLoadingWashingMachine {

    @Override
    public Samsung getSamsungProduct(String name) {
        return this;
    }

    @Override
    public Boolean getParts() {
        System.out.println("Getting Parts..:: Front Loading 10 Kg Washing Machine");
        return TRUE;
    }

    @Override
    public Boolean assembleProduct() {
        System.out.println("Getting Parts..:: Front Loading 10 Kg Washing Machine");
        return TRUE;
    }

    @Override
    public Boolean getAccessories() {
        System.out.println("Getting Parts..:: Front Loading 10 Kg Washing Machine");
        return TRUE;
    }

    @Override
    public Boolean labelBrand() {
        System.out.println("Getting Parts..:: Front Loading 10 Kg Washing Machine");
        return TRUE;
    }

    @Override
    public Boolean packProduct() {
        System.out.println("Getting Parts..:: Front Loading 10 Kg Washing Machine");
        return TRUE;
    }
}
