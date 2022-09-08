package com.example.demo.controller;

import com.example.demo.model.Vehicle;
import com.example.demo.service.VehicleService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @GetMapping("/vehicles")
    public List<Vehicle> geVehicle()
    {
        return vehicleService.getVehicle();
    }

    @GetMapping("/vehicles/{id}")
    public Vehicle getSingleVehicle(@PathVariable long id)
    {
        return vehicleService.getSingleVehicle(id);
    }

    @PostMapping("/vehicles")
    public Vehicle addVehicle(@RequestBody Vehicle vehicle) {
        return vehicleService.addVehicle(vehicle);
    }

    @PutMapping("/vehicles")
    public Vehicle editVehicle(@RequestBody Vehicle vehicle)
    {
        return vehicleService.editVehicle(vehicle);
    }


    @DeleteMapping("/vehicles/{id}")
    public void deleteVehicle(@PathVariable long id)
    {
        vehicleService.deleteVehicle(id);
    }
}
