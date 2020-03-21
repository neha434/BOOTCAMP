package com.example.Rest.StaticFiltering;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class StaticController {
    @GetMapping("/staticFiltering1")
    public StaticF returnStaticFiltering(){
        return new StaticF("Neha","pass");
    }
    @GetMapping("/staticFiltering2")
    public List<StaticF> returnStaticFilteringResult(){
        return Arrays.asList(new StaticF("Neha","pass1")
                ,new StaticF("Riya","pass2"));
    }
}
