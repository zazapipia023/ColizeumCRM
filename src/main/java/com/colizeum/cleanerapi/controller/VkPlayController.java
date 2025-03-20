package com.colizeum.cleanerapi.controller;

import com.colizeum.cleanerapi.model.VkPlay;
import com.colizeum.cleanerapi.service.VkPlayService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/vk")
public class VkPlayController {

    private final VkPlayService service;

    @PostMapping("")
    public void add(@RequestParam String name) {
        VkPlay vkPlay = new VkPlay();
        vkPlay.setName(name);
        service.save(vkPlay);
    }

    @GetMapping("")
    public List<VkPlay> getAll() {
        return service.findAll();
    }

    @DeleteMapping("")
    public void delete(@RequestParam String name) {
        service.delete(name);
    }

}
