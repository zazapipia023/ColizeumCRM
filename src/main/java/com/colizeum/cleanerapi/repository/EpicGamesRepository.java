package com.colizeum.cleanerapi.repository;

import com.colizeum.cleanerapi.model.EpicGames;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EpicGamesRepository extends JpaRepository<EpicGames, Long> {

    Optional<EpicGames> findByName(String name);

    void deleteByName(String name);

}
