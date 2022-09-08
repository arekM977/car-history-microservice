package com.example.demo.service;

import com.example.demo.model.Inspection;
import com.example.demo.repository.InspectionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InspectionService {

    @Autowired
    private InspectionRepository inspectionRepository;

    public Inspection addInspection(Inspection inspection)
    {
        return inspectionRepository.save(inspection);
    }

}
