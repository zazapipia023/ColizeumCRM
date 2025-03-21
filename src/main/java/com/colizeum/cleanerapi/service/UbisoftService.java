package com.colizeum.cleanerapi.service;

import com.colizeum.cleanerapi.model.Ubisoft;
import com.colizeum.cleanerapi.repository.UbisoftRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class UbisoftService {

    private final UbisoftRepository repository;

    public Ubisoft findOne(String name) {
        Optional<Ubisoft> ubisoft = repository.findByName(name);
        return ubisoft.orElse(null);
    }

    public List<Ubisoft> findAll() {
        return repository.findAll();
    }

    @Transactional
    public void save(Ubisoft ubisoft) {
        repository.save(ubisoft);
    }

    @Transactional
    public void delete(String name) {
        repository.deleteByName(name);
    }

}
