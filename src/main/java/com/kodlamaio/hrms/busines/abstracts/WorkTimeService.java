package com.kodlamaio.hrms.busines.abstracts;

import java.util.List;

import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.entities.concretes.WorkTime;

public interface WorkTimeService {
    public DataResult<List<WorkTime>> getAll();
}
