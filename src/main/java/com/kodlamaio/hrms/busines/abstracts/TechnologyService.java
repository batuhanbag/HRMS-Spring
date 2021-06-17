package com.kodlamaio.hrms.busines.abstracts;

import java.util.List;

import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.entities.concretes.Technology;
import com.kodlamaio.hrms.entities.dtos.TechnologyForSerDto;

public interface TechnologyService {
    public Result addTechnology(TechnologyForSerDto technologyForSerDto);
    public Result deleteTechnology(int technologyId);
    public DataResult<List<Technology>> getByCvId(int cvId);
}
