package com.example.yd.beeradviser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YD on 21.11.2016.
 */

public class BeerExpert {

    List<String> getBrands(String color){
        List<String> brands = new ArrayList<String>();

        if(color.equals("Amber")){
            brands.add("Jack Amber");
            brands.add("Red Moose");
        }else{
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }

        return brands;
    }
}
