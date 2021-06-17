package com.kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodlamaio.hrms.entities.concretes.Candidate;

public interface CandidateDao extends JpaRepository<Candidate,Integer> {
    Candidate findByNationalNumber(String nationalNumber);
    Candidate findByEmail(String email);
}
