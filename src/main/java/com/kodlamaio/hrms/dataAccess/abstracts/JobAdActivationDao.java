package com.kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodlamaio.hrms.entities.concretes.JobAdActivation;

public interface JobAdActivationDao extends JpaRepository<JobAdActivation,Integer> {
}
