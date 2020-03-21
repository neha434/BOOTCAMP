package com.example.Rest.DynamicFiltering;


import com.fasterxml.jackson.databind.ser.BeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DynamicController {
    @GetMapping("DynamicFiltering")
    public MappingJacksonValue returnDynamicFilteringResult(){
        DynamicF someBean = new DynamicF("user","Pass");
        SimpleBeanPropertyFilter simpleBeanPropertyFilter = SimpleBeanPropertyFilter.
                filterOutAllExcept("username");
        FilterProvider filterProvider = new SimpleFilterProvider().
                addFilter("Filter",simpleBeanPropertyFilter);
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(someBean);
        mappingJacksonValue.setFilters(filterProvider);
        return mappingJacksonValue;
    }
}
