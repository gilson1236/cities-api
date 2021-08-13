package com.github.gilson1236.citiesapi.states.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.github.gilson1236.citiesapi.states.entities.State;
import com.github.gilson1236.citiesapi.states.repositories.StateRepository;

@RestController
@RequestMapping("/states")
public class StateResource {

    @Autowired
    private StateRepository stateRepository;

    @GetMapping
    public List<State> staties(){
        return stateRepository.findAll();
    }
}
