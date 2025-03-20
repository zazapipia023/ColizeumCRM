package com.colizeum.cleanerapi.repository;

import com.colizeum.cleanerapi.model.Ubisoft;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UbisoftRepository extends JpaRepository<Ubisoft, Long> {

    Optional<Ubisoft> findByName(String name);

    void deleteByName(String name);

}
