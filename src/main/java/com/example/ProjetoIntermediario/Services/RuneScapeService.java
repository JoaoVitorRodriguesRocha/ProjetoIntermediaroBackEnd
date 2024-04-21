package com.example.ProjetoIntermediario.Services;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class RuneScapeService {
    private final WebClient webClient;

    public RuneScapeService() {
        this.webClient = WebClient.create("https://api.runescape.wiki");
    }

    public String getQuestDetails(String questName) {
        return webClient.get()
                .uri("/runemetrics/quests?title=" + questName)
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }


}
