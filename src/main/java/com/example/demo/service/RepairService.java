package com.example.demo.service;

import com.example.demo.model.Repair;
import com.example.demo.repository.RepairRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RepairService {

    @Autowired
    private RepairRepository repairRepository;

    public Repair addRepair(Repair repair)
    {
        return repairRepository.save(repair);
    }

}
