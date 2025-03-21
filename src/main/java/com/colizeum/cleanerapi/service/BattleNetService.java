package com.colizeum.cleanerapi.service;

import com.colizeum.cleanerapi.model.BattleNet;
import com.colizeum.cleanerapi.repository.BattleNetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class BattleNetService {

    private final BattleNetRepository repository;

    public BattleNet findOne(String name) {
        Optional<BattleNet> battleNet = repository.findByName(name);
        return battleNet.orElse(null);
    }

    public List<BattleNet> findAll() {
        return repository.findAll();
    }

    @Transactional
    public void save(BattleNet battleNet) {
        repository.save(battleNet);
    }

    @Transactional
    public void delete(String name) {
        repository.deleteByName(name);
    }

}
