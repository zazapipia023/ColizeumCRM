package com.colizeum.cleanerapi.controller;

import com.colizeum.cleanerapi.model.BattleNet;
import com.colizeum.cleanerapi.service.BattleNetService;
import jakarta.validation.constraints.NotEmpty;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/battle_net")
public class BattleNetController {

    private final BattleNetService service;

    @PostMapping("")
    public void add(@RequestParam String name) {
        BattleNet battleNet = new BattleNet();
        battleNet.setName(name);
        service.save(battleNet);
    }

    @GetMapping("")
    public List<BattleNet> getAll() {
        return service.findAll();
    }

    @DeleteMapping("")
    public void delete(@RequestParam String name) {
        service.delete(name);
    }

}
