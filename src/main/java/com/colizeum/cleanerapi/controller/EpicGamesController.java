package com.colizeum.cleanerapi.controller;

import com.colizeum.cleanerapi.model.EpicGames;
import com.colizeum.cleanerapi.service.EpicGamesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/epic")
public class EpicGamesController {

    private final EpicGamesService service;

    @PostMapping("")
    public void add(@RequestParam String name) {
        EpicGames epicGames = new EpicGames();
        epicGames.setName(name);
        service.save(epicGames);
    }

    @GetMapping("")
    public List<EpicGames> findAll() {
        return service.findAll();
    }

    @DeleteMapping("")
    public void delete(@RequestParam String name) {
        service.delete(name);
    }

}
