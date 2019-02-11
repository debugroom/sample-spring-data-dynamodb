package org.debugroom.sample.spring.data.dynamodb.domain.service;

import org.debugroom.sample.spring.data.dynamodb.domain.model.SampleTable;

import java.util.List;

public interface SampleService {

    public List<SampleTable> getSampleTables();

}
