package com.kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodlamaio.hrms.entities.concretes.WorkPlace;

public interface WorkPlaceDao extends JpaRepository<WorkPlace,Integer> {
}
