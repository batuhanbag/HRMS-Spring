package com.kodlamaio.hrms.busines.abstracts;

import java.util.List;

import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.entities.concretes.School;
import com.kodlamaio.hrms.entities.dtos.SchoolForSerDto;

public interface SchoolService {
    public Result addSchool(SchoolForSerDto schoolForSerDto);
    public Result deleteSchool(int schoolId);
    public DataResult<List<School>> getByCvId(int cvId);
}
