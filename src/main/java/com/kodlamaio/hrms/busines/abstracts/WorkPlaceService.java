package com.kodlamaio.hrms.busines.abstracts;

import java.util.List;

import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.entities.concretes.WorkPlace;

public interface WorkPlaceService {
    public DataResult<List<WorkPlace>> getAll();
}
