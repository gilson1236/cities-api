package com.github.gilson1236.citiesapi.cities.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.gilson1236.citiesapi.cities.entities.City;
import com.github.gilson1236.citiesapi.cities.repositories.CityRepository;

@RestController
@RequestMapping("/cities")
public class CityResource {

    @Autowired
    private CityRepository cityRepository;

    @GetMapping
    public Page<City> cities(final Pageable page){
        return cityRepository.findAll(page);
    }
}
