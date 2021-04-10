package com.project.community_hub.controller;

import com.project.community_hub.model.Music;
import com.project.community_hub.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MusicController {

    @Autowired
    MusicRepository musicRepository;

    @PostMapping("/addmusic")
    public String addMusic(Music music)  {
        musicRepository.save(music);

        return "";
    }
}
