package com.kodlamaio.hrms.busines.abstracts;

import java.util.List;

import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.entities.concretes.Language;
import com.kodlamaio.hrms.entities.dtos.LanguageForSetDto;

public interface LanguageService {
    public Result addLanguage(LanguageForSetDto languageForSetDto);
    public Result deleteLanguage(int languageId);
    public DataResult<List<Language>> getByCvId(int cvId);
}
