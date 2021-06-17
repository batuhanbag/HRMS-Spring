package com.kodlamaio.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.kodlamaio.hrms.busines.abstracts.ExperianceService;
import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.entities.concretes.Experiance;
import com.kodlamaio.hrms.entities.dtos.ExperianceForSetDto;

import java.util.List;

@RestController
@RequestMapping("/api/experiances")
@CrossOrigin
public class ExperiancesController {

    private ExperianceService experianceService;

    @Autowired
    public ExperiancesController(ExperianceService experianceService) {
        this.experianceService = experianceService;
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody ExperianceForSetDto experianceForSetDto){
        Result result = this.experianceService.add(experianceForSetDto);
        if(result.isSuccess()){
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestParam int experianceId){
        return this.experianceService.delete(experianceId);
    }

    @GetMapping("/getByCvId")
    public DataResult<List<Experiance>> getByCvId(@RequestParam int id){
        return this.experianceService.getByCvId(id);
    }
}
