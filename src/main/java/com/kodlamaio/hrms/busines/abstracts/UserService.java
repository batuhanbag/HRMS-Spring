package com.kodlamaio.hrms.busines.abstracts;

import java.util.List;

import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.entities.concretes.User;

public interface UserService {
    DataResult<List<User>> getAll();
    DataResult<User> getByEmail(String email);
}
