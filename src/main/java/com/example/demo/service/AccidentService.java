package com.example.demo.service;

import com.example.demo.model.Accident;
import com.example.demo.repository.AccidentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccidentService {

    @Autowired
    private AccidentRepository accidentRepository;

    public Accident addAccident(Accident accident)
    {
        return accidentRepository.save(accident);
    }

}
