package com.project.community_hub.repository;

import com.project.community_hub.model.Cook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CookRepository extends JpaRepository<Cook,Integer> {
}
