package com.example.rest.RestfulWeb.RestfulServices.filtering;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class StaticFilterService
{
    private static int count = 4;
    private static List<StaticFilter> det = new ArrayList<>();

    static
    {
        det.add(new StaticFilter(6,"Payal","ak02"));
        det.add(new StaticFilter(7,"Ayush","ayush12"));
        det.add(new StaticFilter(8,"Kanika","ka01"));
        det.add(new StaticFilter(9,"Rohan","ro18"));
    }


    public List<StaticFilter> findAll()
    {
        return det;
    }
}
