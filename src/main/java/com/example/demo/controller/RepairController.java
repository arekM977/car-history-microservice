package com.example.demo.controller;


import com.example.demo.model.Repair;
import com.example.demo.service.RepairService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RepairController {

    @Autowired
    private RepairService repairService;


    @PostMapping("/repairs/{id}")

    public Repair addRepair(@RequestBody Repair repair) {
        return repairService.addRepair(repair);
    }


}
