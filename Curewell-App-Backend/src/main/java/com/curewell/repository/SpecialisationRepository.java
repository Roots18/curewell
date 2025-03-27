package com.curewell.repository;

import com.curewell.entity.Doctor;
import com.curewell.entity.Specialisation;
import com.curewell.entity.Surgery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SpecialisationRepository extends JpaRepository<Specialisation,String> {

}