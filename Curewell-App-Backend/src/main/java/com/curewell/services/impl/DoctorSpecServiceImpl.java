package com.curewell.services.impl;

import com.curewell.entity.Doctor;
import com.curewell.entity.DoctorSpec;
import com.curewell.entity.Specialisation;
import com.curewell.repository.DoctorSpecRepository;
import com.curewell.repository.DoctorRepository;
import com.curewell.repository.SpecialisationRepository;
import com.curewell.services.DoctorSpecService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class DoctorSpecServiceImpl implements DoctorSpecService {

    private DoctorSpecRepository DoctorSpecRepository;
    private DoctorRepository doctorRepository;
    private SpecialisationRepository specialisationRepository;

    public DoctorSpecServiceImpl(DoctorSpecRepository DoctorSpecRepository,
                                 DoctorRepository doctorRepository,
                                 SpecialisationRepository specialisationRepository) {
        this.DoctorSpecRepository = DoctorSpecRepository;
        this.doctorRepository = doctorRepository;
        this.specialisationRepository = specialisationRepository;
    }

    @Override
    public List<DoctorSpec> getAllDoctorSpec() {
        return DoctorSpecRepository.findAll();
    }

    @Override
    public DoctorSpec addDoctorSpecialization(Long doctorId, String specCode, LocalDate specializationDate) {
        Optional<Doctor> doctor = doctorRepository.findById(doctorId);
        Optional<Specialisation> specialisation = specialisationRepository.findById(specCode);

        if (doctor.isEmpty() || specialisation.isEmpty()) {
            throw new RuntimeException("Doctor or Specialisation not found!");
        }

        DoctorSpec doctorSpecialization = new DoctorSpec(doctor.get(), specialisation.get(), specializationDate);
        return DoctorSpecRepository.save(doctorSpecialization);
    }
}