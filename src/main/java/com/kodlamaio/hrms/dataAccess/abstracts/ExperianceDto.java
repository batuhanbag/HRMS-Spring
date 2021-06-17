package com.kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodlamaio.hrms.entities.concretes.Experiance;

import java.util.List;

public interface ExperianceDto extends JpaRepository<Experiance,Integer> {
    List<Experiance> findByCvId(int id);
}
