package org.debugroom.sample.spring.data.dynamodb.domain.service;

import org.debugroom.sample.spring.data.dynamodb.domain.model.SampleTable;
import org.debugroom.sample.spring.data.dynamodb.domain.repository.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SampleServiceImpl implements SampleService{

    @Autowired
    SampleRepository sampleRepository;

    @Override
    public List<SampleTable> getSampleTables() {
        List<SampleTable> samples = new ArrayList<>();
        sampleRepository.findAll().iterator().forEachRemaining(samples::add);
        return samples;
    }

}
