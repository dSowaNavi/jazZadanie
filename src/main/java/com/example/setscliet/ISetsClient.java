package com.example.setscliet;

import com.example.contracts.SetDto;

public interface ISetsClient {
    SetDto getSet(String number);
}
