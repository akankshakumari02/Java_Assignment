package com.example.rest.RestfulWeb.RestfulServices.filtering;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DynamicFilterService
{
    private static int count = 4;
    private static List<DynamicFilter> det = new ArrayList<>();

    static
    {
        det.add(new DynamicFilter(6,"Payal","ak02"));
        det.add(new DynamicFilter(7,"Ayush","ayush12"));
        det.add(new DynamicFilter(8,"Kanika","ka01"));
        det.add(new DynamicFilter(9,"Rohan","ro18"));
    }


    public List<DynamicFilter> findAll()
    {
        return det;
    }
}
