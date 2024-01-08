package com.self.selfintroduction.services;


import com.self.selfintroduction.domain.Countries;
import com.self.selfintroduction.repo.CountriesRepo;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class CountriesService {

    private final CountriesRepo countriesRepo;

    @Autowired
    public CountriesService(CountriesRepo countriesRepo){
        this.countriesRepo = countriesRepo;
    }

    public List<Countries> findeAllCountries(){
        return countriesRepo.findAll();
    }

    public Countries addNewCountrie(Countries countries){
        return countriesRepo.save(countries);
    }

    public void deleteCountrie(Long id){
        countriesRepo.deleteById(id);
    }
}
