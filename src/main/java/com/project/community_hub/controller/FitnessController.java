package com.project.community_hub.controller;

import com.project.community_hub.model.Fitness;
import com.project.community_hub.repository.FitnessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FitnessController {

    @Autowired
    FitnessRepository fitnessRepository;

    @PostMapping("/addfitness")
    public String addFitness(Fitness fitness)  {
        fitnessRepository.save(fitness);

        return "";
    }
}
