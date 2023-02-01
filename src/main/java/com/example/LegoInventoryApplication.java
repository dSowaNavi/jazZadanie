package com.example;

import com.example.setscliet.ISetsClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LegoInventoryApplication implements CommandLineRunner {

    ISetsClient client;

    public LegoInventoryApplication(ISetsClient client) {
        this.client = client;
    }

    public static void main(String[] args) {
        SpringApplication.run(LegoInventoryApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Main.addRiverRunners(client);
    }
}

