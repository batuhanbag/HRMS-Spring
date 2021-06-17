package com.kodlamaio.hrms.busines.abstracts;

import org.springframework.web.multipart.MultipartFile;

import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.entities.concretes.Image;

import java.util.List;

public interface ImageService {
    DataResult<List<Image>> getAll();
    Result update(MultipartFile multipartFile,int cvId);
    Result delete(int id);
    DataResult<Image> getById(int id);
    Boolean isExist(int id);
}
