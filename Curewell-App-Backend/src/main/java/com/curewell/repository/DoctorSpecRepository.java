package com.curewell.repository;

import com.curewell.entity.DoctorSpec;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DoctorSpecRepository extends JpaRepository<DoctorSpec,String> {

}