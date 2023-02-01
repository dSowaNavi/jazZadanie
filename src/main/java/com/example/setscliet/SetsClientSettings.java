package com.example.setscliet;

public class SetsClientSettings implements ISetsClientSettings {
    private String apiKey;
    private String baseUrl;
    private int apiVersion;

    public SetsClientSettings(String apiKey, String baseUrl, int apiVersion) {
        this.apiKey = apiKey;
        this.baseUrl = baseUrl;
        this.apiVersion = apiVersion;
    }

    @Override
    public String getApiKey() {
        return apiKey;
    }

    @Override
    public String getBaseUrl() {
        return baseUrl;
    }

    @Override
    public int getApiVersion() {
        return apiVersion;
    }
}
