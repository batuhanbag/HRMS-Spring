package com.kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodlamaio.hrms.entities.concretes.Cv;

public interface CvDao extends JpaRepository<Cv,Integer> {
    Cv findByCandidateId(int id);
}
