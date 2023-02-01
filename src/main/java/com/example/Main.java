package com.example;

import com.example.contracts.SetDto;
import com.example.repositories.SetRepository;
import com.example.setscliet.ISetsClient;
import com.example.setscliet.ISetsClientSettings;
import com.example.setscliet.SetsClient;
import com.example.setscliet.SetsClientSettings;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

public class Main {
    public static void main(String[] args){
        ISetsClientSettings settings = new
                SetsClientSettings("0ef2a54c4a5edf64bf1d41576d97b84b", "https://rebrickable.com/api", 3);
        ISetsClient setsClient = new SetsClient(settings);
        addRiverRunners(setsClient);
    }

    public static void addRiverRunners(ISetsClient setsClient) {
        SetDto result = setsClient.getSet("6665-1");
    }
}
