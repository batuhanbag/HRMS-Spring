package com.kodlamaio.hrms.busines.abstracts;


import java.util.List;

import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.entities.concretes.Experiance;
import com.kodlamaio.hrms.entities.dtos.ExperianceForSetDto;

public interface ExperianceService{
    Result add(ExperianceForSetDto experianceForSetDto);
    Result delete(int experianceId);
    DataResult<List<Experiance>> getByCvId(int id);
}
