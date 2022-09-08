package com.example.demo.controller;


import com.example.demo.model.Inspection;
import com.example.demo.service.InspectionService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class InspectionController {

    @Autowired
    private InspectionService inspectionService;


    @PostMapping("/inspections/{id}")

    public Inspection addInspection(@RequestBody Inspection inspection) {
        return inspectionService.addInspection(inspection);
    }


}
