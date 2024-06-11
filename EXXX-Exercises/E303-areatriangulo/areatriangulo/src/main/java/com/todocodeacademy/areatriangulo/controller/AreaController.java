package com.todocodeacademy.areatriangulo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AreaController {
    
    @GetMapping("/areapath/{base}/{altura}")
    @ResponseBody
    public String area1(@PathVariable double base, 
                            @PathVariable double altura){
        return "El área del triángulo es: " + ((base*altura)/2);
    }
    
    @GetMapping("/arearequest")
    @ResponseBody
    public String area2(@RequestParam double base,
                            @RequestParam double altura){
        return "El área del triángulo es: " + ((base*altura)/2);
    }
    
}
