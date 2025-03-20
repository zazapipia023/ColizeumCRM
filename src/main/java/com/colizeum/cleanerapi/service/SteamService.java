package com.colizeum.cleanerapi.service;

import com.colizeum.cleanerapi.model.Steam;
import com.colizeum.cleanerapi.repository.SteamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class SteamService {

    private final SteamRepository repository;

    public Steam findOne(String name) {
        Optional<Steam> steam = repository.findByName(name);
        return steam.orElse(null);
    }

    public List<Steam> findAll() {
        return repository.findAll();
    }

    @Transactional
    public void save(Steam steam) {
        repository.save(steam);
    }

    @Transactional
    public void delete(String name) {
        repository.deleteByName(name);
    }

}
