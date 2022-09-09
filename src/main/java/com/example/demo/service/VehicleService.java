package com.example.demo.service;

import com.example.demo.model.Vehicle;
import com.example.demo.repository.VehicleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    public List<Vehicle> getVehicle()
    {
        return vehicleRepository.findAll();
    }

    public Vehicle getSingleVehicle(long id)
    {
        return vehicleRepository.findById(id)
                .orElseThrow();
    }
    public Vehicle addVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @Transactional
    public Vehicle editVehicle(Vehicle vehicle) {
       Vehicle vehicleEdited =  vehicleRepository.findById(vehicle.getId()).orElseThrow();
       vehicleEdited.setMake(vehicle.getMake());
       vehicleEdited.setModel(vehicle.getModel());

       //hibernate sam sprawdza czy zmienione są pola encji dlatego nie potrzebne wywołanie metody postRepository.save(post)  - Mechanizm dirty Checking)
       return vehicleEdited;
    }

    public void deleteVehicle(long id) {
        vehicleRepository.deleteById(id);
    }
    
}
