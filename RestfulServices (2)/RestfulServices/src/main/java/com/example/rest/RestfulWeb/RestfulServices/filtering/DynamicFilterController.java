package com.example.rest.RestfulWeb.RestfulServices.filtering;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DynamicFilterController
{
    @Autowired
    private DynamicFilterService service;

  @GetMapping("/dynamic-filter")
    public MappingJacksonValue findAllUsers()
    {
        List<DynamicFilter> list = service.findAll();
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("id","name");
        FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter",filter);
        MappingJacksonValue mapping = new MappingJacksonValue(list);

        mapping.setFilters(filters);

        return mapping;
    }
}
