package com.janitri.controller;

import com.janitri.model.HeartRate;
import com.janitri.repository.HeartRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/heartrate")
public class HeartRateController {
    @Autowired
    private HeartRateRepository heartRateRepository;

    @PostMapping("/record")
    public HeartRate recordHeartRate(@RequestBody HeartRate heartRate) {
        return heartRateRepository.save(heartRate);
    }

    @GetMapping("/patient/{patientId}")
    public List<HeartRate> getHeartRates(@PathVariable Long patientId) {
        return (List<HeartRate>) heartRateRepository.getById(patientId);
    }
}
