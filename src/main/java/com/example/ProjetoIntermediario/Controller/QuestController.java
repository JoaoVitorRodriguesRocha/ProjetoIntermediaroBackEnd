package com.example.ProjetoIntermediario.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestController {

    private final RuneScapeService apiService;

    @Autowired
    public QuestController(RuneScapeService apiService) {
        this.apiService = apiService;
    }

    @GetMapping("/quest/{name}")
    public String getQuestDetails(@PathVariable String name) {
        return apiService.getQuestDetails(name);
    }
}
