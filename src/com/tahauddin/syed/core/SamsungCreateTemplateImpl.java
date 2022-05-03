package com.tahauddin.syed.core;

public abstract class SamsungCreateTemplateImpl implements SamsungCreateTemplate {

    public final Boolean createPhone(){
        if (getParts()) {
            System.out.println("Getting Part Successful");
             if(assembleProduct()){
                 System.out.println("Assembling Product Successful");
                 if(getAccessories()){
                     System.out.println("Getting Accessories Successful");
                     if(labelBrand()){
                         System.out.println("Marking Brand Label Successful");
                         if(packProduct()){
                             System.out.println("Packing Product Successful");
                             return true;
                         }
                         System.out.println("Packing Product Failure");
                         return false;
                     }
                     System.out.println("Marking Brand Label Failure");
                     return false;
                 }
                 System.out.println("Getting Accessories Failure");
                 return false;
             }
             System.out.println("Assembling Product Failure");
             return false;
        }
        System.out.println("Getting Part Failure");
        return false;
    }
}
