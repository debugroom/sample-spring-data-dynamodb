package org.debugroom.sample.spring.data.dynamodb.domain.repository;

import org.debugroom.sample.spring.data.dynamodb.domain.model.SampleTable;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface SampleRepository extends CrudRepository<SampleTable, String> {
}
