package com.drascop.coctracker.service;

import java.net.InetAddress;
import java.net.UnknownHostException;

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
    private final String apiUrl = "https://api.clashofclans.com/v1/players/";
    private final ObjectMapper objectMapper = new ObjectMapper();
    private final String apiKey;


    public PlayerService(Dotenv dotenv) {
        this.restTemplate = new RestTemplate();
        this.apiKey = dotenv.get("CLASH_API_KEY");

        try {
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("Local IP Address: " + localHost.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }


    public Player getPlayerById(String playerId) {
        if (!playerId.startsWith("#")) {
            playerId = "#" + playerId;  // Prepend # if missing
        }
        String url = apiUrl + playerId;
        
        // Ensure correct encoding
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url);
    
        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", "application/json");
        headers.set("Authorization", "Bearer " + apiKey);
    
        HttpEntity<String> entity = new HttpEntity<>(headers);
    
        ResponseEntity<String> response = restTemplate.exchange(
            builder.toUriString(), HttpMethod.GET, entity, String.class);
    
        try {
            return objectMapper.readValue(response.getBody(), Player.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Failed to parse player data", e);
        }
    }
    
}
