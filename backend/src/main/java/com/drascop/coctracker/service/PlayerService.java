package com.drascop.coctracker.service;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collections;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

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
    
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.set("Authorization", "Bearer " + apiKey);
    
        HttpEntity<String> entity = new HttpEntity<>(headers);
        
        try {
            URI uri = new URI(apiBaseURL + "%23" + playerId);
            ResponseEntity<String> response = restTemplate.exchange(uri, HttpMethod.GET, entity, String.class);
            try {
                return objectMapper.readValue(response.getBody(), Player.class);
            } catch (JsonProcessingException e) {
                throw new RuntimeException("Failed to parse player data", e);
            }
        } catch (URISyntaxException ex ) {

        }
        return null;
    }
    
}
