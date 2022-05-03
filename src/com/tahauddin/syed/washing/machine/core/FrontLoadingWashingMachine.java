package com.tahauddin.syed.washing.machine.core;

import com.tahauddin.syed.core.Samsung;

public interface FrontLoadingWashingMachine extends Samsung {

    Boolean getParts();
    Boolean assembleProduct();
    Boolean getAccessories();
    Boolean labelBrand();
    Boolean packProduct();
}
