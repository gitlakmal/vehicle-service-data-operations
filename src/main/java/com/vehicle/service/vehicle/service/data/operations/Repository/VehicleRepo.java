package com.vehicle.service.vehicle.service.data.operations.Repository;

import com.vehicle.service.vehicle.service.data.operations.Entity.vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@org.springframework.stereotype.Repository
public interface VehicleRepo extends JpaRepository<vehicle, Long> {
    List<vehicle> findByServiceYear(int serviceYear);

    boolean existsByServiceYear(int serviceYear);

    void deleteByServiceYear(int serviceYear);
}