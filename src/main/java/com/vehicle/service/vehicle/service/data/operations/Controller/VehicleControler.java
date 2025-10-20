package com.vehicle.service.vehicle.service.data.operations.Controller;

import com.vehicle.service.vehicle.service.data.operations.DTO.VehicleDTO;
import com.vehicle.service.vehicle.service.data.operations.Entity.vehicle;
import com.vehicle.service.vehicle.service.data.operations.Services.VehicleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/service")
@CrossOrigin(origins = "*")
public class VehicleControler {

    @Autowired
    private VehicleServices vehicleServices;

    @PostMapping("/add-service")
    public ResponseEntity<?> addservice(@RequestBody VehicleDTO vehicleDTO) {
        String message = vehicleServices.addservice(vehicleDTO);
        return ResponseEntity.ok(message);

    }

    @GetMapping("/year/{year}")
    public ResponseEntity<List<VehicleDTO>> getVehiclesByYear(@PathVariable int year) {
        List<VehicleDTO> vehicles = vehicleServices.findbyyear(year);
        return ResponseEntity.ok(vehicles);
    }

    @GetMapping("/service-id/{id}")
    public ResponseEntity<?> getServicebyId (@PathVariable Long id){
        String massage = vehicleServices.findservicebyid(id);
        return ResponseEntity.ok(massage);
    }
    @DeleteMapping("/delete-service/{year}")
    public ResponseEntity<?> deleteservice(@PathVariable int year){
        String massage = vehicleServices.deleteservice(year);
        return ResponseEntity.ok(massage);
    }

    }

//public String addHospital(@RequestBody Hospital_req_DTO hospital_req_DTO) {
//    String massage = hospitalService.addHospital(hospital_req_DTO);
//    return massage;
//}