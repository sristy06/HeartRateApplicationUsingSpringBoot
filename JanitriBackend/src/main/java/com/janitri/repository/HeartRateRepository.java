package com.janitri.repository;

import com.janitri.model.HeartRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface HeartRateRepository extends JpaRepository<HeartRate, Long> {

    // Custom query method to find heart rate records by patient ID
    List<HeartRate> findByPatientId(Long patientId);
}
