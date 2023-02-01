package com.example.controllers;

import com.example.contracts.SetDto;
import com.example.services.SetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sets")
public class SetController {
    @Autowired
    private SetService setService;

    @GetMapping(value = "")
    public List<SetDto> getAll(){
        return setService.getAll();
    }


    @PostMapping(value = "/add")
    @ResponseBody
    public void save(@RequestBody SetDto setDto){
        setService.save(setDto);
    }

    @GetMapping("/{number}")
    public SetDto getBySetNumber(@PathVariable("number") String number) {
        SetDto result = setService.getBySetNumber(number);
//        setService.save(result);
        return result;
    }
}
