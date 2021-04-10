package com.project.community_hub.controller;

import com.project.community_hub.model.User;
import com.project.community_hub.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("")
    public String viewHomePage() {
        return "index";
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());

        return "signup";
    }

    @PostMapping("/process_register")
    public String processRegister(User user)  {
        userRepository.save(user);

        return "login";
    }

    @PostMapping("/process_login")
    public String processLogin(User user){
    User u=userRepository.findUserByEmailAndPassword(user.getEmail(), user.getPassword());
    if(u!=null)
        return "home";
    return "error";
    }


}
