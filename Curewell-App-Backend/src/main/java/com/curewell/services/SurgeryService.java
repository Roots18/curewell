package com.curewell.services;

import com.curewell.entity.Surgery;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public interface SurgeryService {
    List<Surgery> getAllSurgeries();
    Surgery getSurgeryById(Long SurgId);
    Surgery addSurgery(Long doctorId, String surgeryName, String specCode, LocalTime startTime, LocalTime endTime, LocalDate surgeryDate);

    // Add a new surgery
//    Surgery addSurgery();

    Surgery updateSurgery(Long SurgId, Surgery surgery);
    //public Surgery updateSurgery(Long surgId, Long doctorId, String surgeryName, String specCode, LocalTime startTime, LocalTime endTime, LocalDate surgeryDate);
    void deleteSurgery(Long SurgId);

    List<Surgery> getSurgeriesByDate();
}