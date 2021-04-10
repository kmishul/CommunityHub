package com.project.community_hub.controller;

import com.project.community_hub.model.Cook;
import com.project.community_hub.repository.CookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CookController {

    @Autowired
    CookRepository cookRepository;

    @PostMapping("/addcook")
    public String addCook(Cook cook)  {
        cookRepository.save(cook);

        return "";
    }
}
