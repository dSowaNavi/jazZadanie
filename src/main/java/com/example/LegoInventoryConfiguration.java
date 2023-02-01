package com.example;

import com.example.setscliet.ISetsClient;
import com.example.setscliet.ISetsClientSettings;
import com.example.setscliet.SetsClient;
import com.example.setscliet.SetsClientSettings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LegoInventoryConfiguration {

    @Bean
    public SetsClientSettings getSettings() {
        return new SetsClientSettings("0ef2a54c4a5edf64bf1d41576d97b84b", "https://rebrickable.com/api", 3);
    }
}
