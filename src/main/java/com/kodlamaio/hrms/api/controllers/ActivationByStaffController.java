package com.kodlamaio.hrms.api.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.kodlamaio.hrms.busines.abstracts.ActivationByStaffService;
import com.kodlamaio.hrms.core.utilities.results.Result;

@RestController
@RequestMapping("/api/acticationbystaff")
@CrossOrigin
public class ActivationByStaffController {

    private ActivationByStaffService activationByStaffService;

    @Autowired
    public ActivationByStaffController(ActivationByStaffService activationByStaffService) {
        this.activationByStaffService = activationByStaffService;
    }

    @GetMapping("/activateemployer")
    public ResponseEntity<?> activateEmployer(@RequestParam int employerId,@RequestParam int staffId){
        Result result=this.activationByStaffService.activateEmployer(employerId, staffId);
        if(result.isSuccess()){
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
    }
}
