package com.vehicle.service.vehicle.service.data.operations.Services.Impl;

import com.vehicle.service.vehicle.service.data.operations.DTO.VehicleDTO;
import com.vehicle.service.vehicle.service.data.operations.Entity.vehicle;
import com.vehicle.service.vehicle.service.data.operations.Repository.VehicleRepo;
import com.vehicle.service.vehicle.service.data.operations.Services.VehicleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VehicleMPL implements VehicleServices {

    @Autowired
    private VehicleRepo vehicleRepo;

    @Override
    public String addservice(VehicleDTO vehicleDTO) {
        vehicle vehicle = new vehicle(
                vehicleDTO.getServiceId(),
                vehicleDTO.getVehicleNo(),
                vehicleDTO.getVehicleType(),
                vehicleDTO.getServiceYear()
        );
        vehicleRepo.save(vehicle);
        return vehicle.getVehicleNo();
    }

    @Override
    public List<VehicleDTO> findbyyear(int year) {
        List<vehicle> vehicles = vehicleRepo.findByServiceYear(year);
        return vehicles.stream()
                .map(v -> new VehicleDTO(
                        v.getServiceId(),
                        v.getVehicleNo(),
                        v.getVehicleType(),
                        v.getServiceYear()))
                .collect(Collectors.toList());
    }

    @Override
    public String findservicebyid(Long id) {
        if(!vehicleRepo.existsById((Long) id)){
            throw new RuntimeException("vehicle not found");
        }else {
            vehicle vehicle = vehicleRepo.getReferenceById((Long) id);
            return vehicle.getVehicleType();
        }

    }

    @Override
    @Transactional
    public String deleteservice(int year) {
        if(!vehicleRepo.existsByServiceYear(year)){
            throw new RuntimeException("vehicle not found");
        }else {
            vehicleRepo.deleteByServiceYear(year);
            return year+"";
        }

        }
}


