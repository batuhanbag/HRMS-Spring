package com.kodlamaio.hrms.busines.abstracts;

import com.kodlamaio.hrms.entities.concretes.Candidate;

public interface NationalValidationService {
    boolean validate(Candidate candidate);
}
