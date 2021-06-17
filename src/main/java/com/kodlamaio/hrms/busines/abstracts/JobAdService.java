package com.kodlamaio.hrms.busines.abstracts;

import java.util.List;

import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.entities.concretes.JobAd;
import com.kodlamaio.hrms.entities.dtos.JobAdDto;

public interface JobAdService {
    Result create(JobAdDto jobAdDto);
    Result setPasssive(int jobAdId);
    Result setActiveAndConfirm(int jobAdId,int staffId);
    DataResult<List<JobAd>> getAll();
    DataResult<JobAd> getByJobAdId(int id);
    DataResult<List<JobAd>> getActiveAds();
    DataResult<List<JobAd>> getActiveAndOrderLastDate();
    DataResult<List<JobAd>> getActiveAndCompanyId(int id);
}
