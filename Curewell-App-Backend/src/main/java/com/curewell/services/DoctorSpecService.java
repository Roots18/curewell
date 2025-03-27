package com.curewell.services;

import com.curewell.entity.DoctorSpec;

import java.time.LocalDate;
import java.util.List;

public interface DoctorSpecService {
    List<DoctorSpec> getAllDoctorSpec();
    DoctorSpec addDoctorSpecialization(Long doctorId, String specCode, LocalDate specializationDate);
}