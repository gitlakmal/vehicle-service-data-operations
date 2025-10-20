package com.vehicle.service.vehicle.service.data.operations.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VehicleDTO {
    private Long serviceId;
    private String vehicleNo;
    private String vehicleType;
    private int serviceYear;
}
