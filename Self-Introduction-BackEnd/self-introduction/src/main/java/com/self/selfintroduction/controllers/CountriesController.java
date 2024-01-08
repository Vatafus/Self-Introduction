package com.self.selfintroduction.controllers;


import com.self.selfintroduction.domain.Countries;
import com.self.selfintroduction.services.CountriesService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("countries")
public class CountriesController {

    @Autowired
    CountriesService countriesService;


    @GetMapping("/getallmycountries")
    public List<Countries> getAllCountries(){
        return countriesService.findeAllCountries();
    }

    @PostMapping("/addCountrie")
    public Countries addCountrie(@RequestBody @Valid Countries countries){
        return countriesService.addNewCountrie(countries);
    }
}
