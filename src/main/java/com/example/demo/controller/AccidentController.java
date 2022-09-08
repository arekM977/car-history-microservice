package com.example.demo.controller;


import com.example.demo.model.Accident;
import com.example.demo.service.AccidentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AccidentController {

    @Autowired
    private AccidentService accidentService;


    @PostMapping("/accidents/{id}")

    public Accident addAccident(@RequestBody Accident accident) {
        return accidentService.addAccident(accident);
    }


}
