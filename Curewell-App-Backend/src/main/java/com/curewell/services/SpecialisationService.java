package com.curewell.services;

import com.curewell.entity.Doctor;
import com.curewell.entity.Specialisation;

import java.util.List;

public interface SpecialisationService {
    List<Specialisation> getAllSpecialisation();
    Specialisation getSpecialisationById(String specCode);
    Specialisation addSpecialisation(Specialisation specialisation);
    Specialisation updateSpecialisation(String specCode, Specialisation specialisation);
    void deleteSpecialisation(String specCode);
//    List<Doctor> getDoctorsBySpecialisation(String specCode);
}