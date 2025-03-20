package com.colizeum.cleanerapi.controller;

import com.colizeum.cleanerapi.model.Steam;
import com.colizeum.cleanerapi.service.SteamService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/steam")
public class SteamController {

    private final SteamService service;

    @PostMapping("")
    public void add(@RequestParam String name, @RequestParam String manifestId) {
        Steam steam = new Steam();
        steam.setName(name);
        steam.setManifestId(manifestId);
        service.save(steam);
    }

    @GetMapping("")
    public List<Steam> getAll() {
        return service.findAll();
    }

    @DeleteMapping("")
    public void delete(@RequestParam String name) {
        service.delete(name);
    }

}
