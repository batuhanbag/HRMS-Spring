package com.kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodlamaio.hrms.entities.concretes.Technology;

import java.util.List;

public interface TechnologyDao extends JpaRepository<Technology,Integer> {
    List<Technology> findByCvId(int id);
}
