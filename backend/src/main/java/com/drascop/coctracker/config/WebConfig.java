package com.drascop.coctracker.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.github.cdimascio.dotenv.Dotenv;

@Configuration
public class WebConfig {
    @Bean
    public Dotenv dotenv() {
        return Dotenv.configure()
                     .directory("backend")  // Set correct directory explicitly
                     .ignoreIfMissing()     // Avoid crashing if .env is missing
                     .load();
    }
}


