package com.kodlamaio.hrms.busines.abstracts;

import java.util.List;

import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.entities.concretes.Candidate;
import com.kodlamaio.hrms.entities.dtos.CandidateForRegisterDto;

public interface CandidateService {
    DataResult<List<Candidate>> getAll();
    DataResult<Candidate> getByNationalNumber(String nationalNumber);
    DataResult<Candidate> getByEmail(String email);
    Result add(CandidateForRegisterDto candidateForRegisterDto);
}
