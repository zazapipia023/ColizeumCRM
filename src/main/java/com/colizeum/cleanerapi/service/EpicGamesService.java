package com.colizeum.cleanerapi.service;

import com.colizeum.cleanerapi.model.EpicGames;
import com.colizeum.cleanerapi.repository.EpicGamesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class EpicGamesService {

    private EpicGamesRepository repository;

    public EpicGames findOne(String name) {
        Optional<EpicGames> epicGames = repository.findByName(name);
        return epicGames.orElse(null);
    }

    public List<EpicGames> findAll() {
        return repository.findAll();
    }

    @Transactional
    public void save(EpicGames epicGames) {
        repository.save(epicGames);
    }

    @Transactional
    public void delete(String name) {
        repository.deleteByName(name);
    }
}
