package com.kodlamaio.hrms.busines.abstracts;

import java.util.List;

import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.entities.concretes.Employer;
import com.kodlamaio.hrms.entities.dtos.EmployerForRegisterDto;

public interface EmployerService {
    DataResult<List<Employer>> getAll();
    DataResult<Employer> getByEmail(String email);
    Result add(EmployerForRegisterDto employerDto);
    DataResult<Employer> getById(int id);
}
