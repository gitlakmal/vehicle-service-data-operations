package com.vehicle.service.vehicle.service.data.operations.Services;

import com.vehicle.service.vehicle.service.data.operations.DTO.VehicleDTO;
import com.vehicle.service.vehicle.service.data.operations.Entity.vehicle;

import java.util.List;

public interface VehicleServices {
    String addservice(VehicleDTO vehicleDTO);

    List<VehicleDTO> findbyyear(int year);

    String findservicebyid(Long id);

    String deleteservice(int year);
}
