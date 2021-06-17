package com.kodlamaio.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.kodlamaio.hrms.busines.abstracts.TechnologyService;
import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.entities.concretes.Technology;
import com.kodlamaio.hrms.entities.dtos.TechnologyForSerDto;

import java.util.List;

@RestController
@RequestMapping("/api/technology")
@CrossOrigin
public class TechnologiesController {

    private TechnologyService technologyService;

    @Autowired
    public TechnologiesController(TechnologyService technologyService) {
        this.technologyService = technologyService;
    }

    @PostMapping("/addTechnology")
    public Result addTechnology(@RequestBody TechnologyForSerDto technologyForSerDto){
        return this.technologyService.addTechnology(technologyForSerDto);
    }

    @DeleteMapping("/deleteTechnology")
    public Result deleteTechnology(@RequestParam int technologyId){
        return this.technologyService.deleteTechnology(technologyId);
    }

    @GetMapping("/getByCvId")
    public DataResult<List<Technology>> getByCvId(@RequestParam int cvId){
        return this.technologyService.getByCvId(cvId);
    }
}
