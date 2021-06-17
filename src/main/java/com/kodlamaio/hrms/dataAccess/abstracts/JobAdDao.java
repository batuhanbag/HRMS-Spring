package com.kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodlamaio.hrms.entities.concretes.JobAd;

import java.util.List;

public interface JobAdDao extends JpaRepository<JobAd,Integer> {
    List<JobAd> findByActive(boolean active);
    List<JobAd> findByActiveOrderByLastDate(boolean active);
    List<JobAd> findByActiveTrueAndEmployer_Id(int id);
}
