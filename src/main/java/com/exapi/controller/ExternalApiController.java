package com.exapi.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/dil")
public class ExternalApiController {


    @GetMapping("/getall")
    public List<Object> getCities(){
        String url="https://restcountries.com/v3.1/all";
        RestTemplate restTemplate=new RestTemplate();

        Object[] object= new Object[] {restTemplate.getForObject(url,Object.class)};
        return Arrays.asList(object);
    }

}
