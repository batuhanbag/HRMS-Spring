package com.kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodlamaio.hrms.entities.concretes.Image;

import java.util.List;

public interface ImageDao extends JpaRepository<Image,Integer> {
    List<Image> findByOrderById();
    Image findByCvId(int id);
}
