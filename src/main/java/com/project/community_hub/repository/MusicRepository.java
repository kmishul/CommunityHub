package com.project.community_hub.repository;

import com.project.community_hub.model.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicRepository extends JpaRepository<Music,Integer> {
}
