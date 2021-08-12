package com.github.gilson1236.citiesapi.countries.resources;

import com.github.gilson1236.citiesapi.countries.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.github.gilson1236.citiesapi.countries.entities.Country;

@RestController
public class CountryResource {

    @Autowired
    private CountryRepository countryRepository;

    @GetMapping("/countries")
    public List<Country> countries(){
        return countryRepository.findAll();
    }
}
