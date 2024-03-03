package com.boilerplate.databaseservice.repository;

import com.boilerplate.databaseservice.model.UserAccess;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface UserAccessRepository extends ElasticsearchRepository<UserAccess, String> {
    Page<UserAccess> findByType(String type, Pageable pageable);
}
