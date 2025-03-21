package com.colizeum.cleanerapi.controller;

import com.colizeum.cleanerapi.model.Ubisoft;
import com.colizeum.cleanerapi.service.UbisoftService;
import jakarta.validation.constraints.NotEmpty;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/ubisoft")
public class UbisoftController {

    private final UbisoftService service;

    @PostMapping("")
    public void add(@RequestParam String name) {
        Ubisoft ubisoft = new Ubisoft();
        ubisoft.setName(name);
        service.save(ubisoft);
    }

    @GetMapping("")
    public List<Ubisoft> findAll() {
        return service.findAll();
    }

    @DeleteMapping("")
    public void delete(@RequestParam String name) {
        service.delete(name);
    }

}
