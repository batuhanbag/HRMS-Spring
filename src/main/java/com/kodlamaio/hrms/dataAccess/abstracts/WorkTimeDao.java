package com.kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodlamaio.hrms.entities.concretes.WorkTime;

public interface WorkTimeDao extends JpaRepository<WorkTime,Integer> {
}
