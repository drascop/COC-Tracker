package com.drascop.coctracker.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.drascop.coctracker.model.Player;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.github.cdimascio.dotenv.Dotenv;

@Service
public class PlayerService {

    private final RestTemplate restTemplate;
    private final String apiBaseURL = "https://api.clashofclans.com/v1/players/";
    private final ObjectMapper objectMapper = new ObjectMapper();
    private final String apiKey;


    public PlayerService(Dotenv dotenv) {
        this.restTemplate = new RestTemplate();
        this.apiKey = dotenv.get("CLASH_API_KEY");
    }


    public Player getPlayerById(String playerId) {

        String url = UriComponentsBuilder.fromHttpUrl(apiBaseURL)
                .pathSegment("%23" + playerId) 
                .toUriString();

    
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + apiKey);
    
        HttpEntity<String> entity = new HttpEntity<>(headers);
    
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
    
        try {
            return objectMapper.readValue(response.getBody(), Player.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Failed to parse player data", e);
        }
    }
    
}
