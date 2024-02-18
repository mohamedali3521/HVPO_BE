package com.HVPO.HVPO.repository;

import com.HVPO.HVPO.model.principal;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface principalRepo extends MongoRepository<principal,Integer> {
}
