package com.colizeum.cleanerapi.repository;

import com.colizeum.cleanerapi.model.BattleNet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BattleNetRepository extends JpaRepository<BattleNet, Long> {

    Optional<BattleNet> findByName(String name);

    void deleteByName(String name);

}
