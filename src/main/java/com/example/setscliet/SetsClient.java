package com.example.setscliet;

import com.example.contracts.SetDto;
import com.example.model.LegoSet;
import com.example.services.SetService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@Slf4j
public class SetsClient implements ISetsClient{
    RestTemplate restClient;
    String baseUrl;
    String apiKey;
    int version;
    @Autowired
    SetService setService;
    private final ISetsClientSettings _settings;

    public SetsClient(ISetsClientSettings settings) {
        restClient = new RestTemplate();
        this.baseUrl = settings.getBaseUrl();
        this.apiKey = settings.getApiKey();
        this.version = settings.getApiVersion();
        _settings=settings;
    }

    @Override
    public SetDto getSet(String number) {
        String url = baseUrl+"/v"+version+"/lego/sets/"+number+"/?key="+apiKey;
        SetDto response = restClient.getForEntity(url, SetDto.class).getBody();
        log.info(response.toString());
        setService.save(response);
        return response;
    }
}
