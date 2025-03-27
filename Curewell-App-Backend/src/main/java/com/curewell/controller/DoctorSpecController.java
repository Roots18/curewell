package com.curewell.controller;

import com.curewell.entity.DoctorSpec;
import com.curewell.entity.Specialisation;
import com.curewell.services.DoctorSpecService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/doctor-specializations")
@CrossOrigin(origins = "*")
public class DoctorSpecController {

    private final DoctorSpecService doctorSpecService;

    public DoctorSpecController(DoctorSpecService doctorSpecService) {
        this.doctorSpecService = doctorSpecService;
    }
    @GetMapping
    public List<DoctorSpec> getAllDoctorSpecialisations() {
        return doctorSpecService.getAllDoctorSpec();
    }

    @PostMapping
    public ResponseEntity<DoctorSpec> addDoctorSpecialization(@RequestBody Map<String, Object> request) {
        Long doctorId = Long.valueOf(request.get("doctorId").toString());
        String specCode = request.get("specializationId").toString(); // Fix: Convert to Long
        LocalDate specializationDate = LocalDate.parse(request.get("specializationDate").toString());

        DoctorSpec newEntry = doctorSpecService.addDoctorSpecialization(doctorId, specCode, specializationDate);
        return ResponseEntity.ok(newEntry);
    }
}