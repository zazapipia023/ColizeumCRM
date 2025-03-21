package com.colizeum.cleanerapi.service;

import com.colizeum.cleanerapi.model.VkPlay;
import com.colizeum.cleanerapi.repository.VkPlayRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class VkPlayService {

    private final VkPlayRepository repository;

    public VkPlay findOne(String name) {
        Optional<VkPlay> vkPlay = repository.findByName(name);
        return vkPlay.orElse(null);
    }

    public List<VkPlay> findAll() {
        return repository.findAll();
    }

    @Transactional
    public void save(VkPlay vkPlay) {
        repository.save(vkPlay);
    }

    @Transactional
    public void delete(String name) {
        repository.deleteByName(name);
    }

}
