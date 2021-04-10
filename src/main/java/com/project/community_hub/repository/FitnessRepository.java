package com.project.community_hub.repository;

import com.project.community_hub.model.Fitness;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FitnessRepository extends JpaRepository<Fitness,Integer> {
}
