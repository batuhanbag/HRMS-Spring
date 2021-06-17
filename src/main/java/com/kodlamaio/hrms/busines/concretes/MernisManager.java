package com.kodlamaio.hrms.busines.concretes;

import org.springframework.stereotype.Service;

import com.kodlamaio.hrms.busines.abstracts.NationalValidationService;
import com.kodlamaio.hrms.entities.concretes.Candidate;

@Service
public class MernisManager implements NationalValidationService {


    @Override
    public boolean validate(Candidate candidate) {
        if(candidate.getNationalNumber().length()!=11){
            return false;
        }
        return true;
    }
}
