package com.colizeum.cleanerapi.repository;

import com.colizeum.cleanerapi.model.VkPlay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VkPlayRepository extends JpaRepository<VkPlay, Long> {

    Optional<VkPlay> findByName(String name);

    void deleteByName(String name);

}
