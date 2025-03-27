package com.curewell.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "DoctorSpecialization")
public class DoctorSpec {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "doctorId", referencedColumnName = "doctorId", nullable = false)
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name = "specializationCode", referencedColumnName = "specCode", nullable = false)
    private Specialisation specialisation;

    @Column(nullable = false)
    private LocalDate specializationDate;

    public DoctorSpec() {}

    public DoctorSpec(Doctor doctor, Specialisation specialisation, LocalDate specializationDate) {
        this.doctor = doctor;
        this.specialisation = specialisation;
        this.specializationDate = specializationDate;
    }

    public Long getId() {
        return id;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Specialisation getSpecialisation() {
        return specialisation;
    }

    public LocalDate getSpecializationDate() {
        return specializationDate;
    }
}