package com.asky.sqs.idservice.segment.impl;

import com.asky.sqs.idservice.segment.IDAllocService;
import com.asky.sqs.idservice.dao.IDAllocMapper;
import com.asky.sqs.idservice.segment.model.LeafAlloc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class IDAllocServiceImpl implements IDAllocService {

    @Autowired
    IDAllocMapper mapper;

    @Override
    public List<LeafAlloc> getAllLeafAllocs() {
        return mapper.getAllLeafAllocs();
    }
    @Transactional
    @Override
    public LeafAlloc updateMaxIdAndGetLeafAlloc(String tag) {
        mapper.updateMaxId(tag);
        return mapper.getLeafAlloc(tag);
    }

    @Transactional
    @Override
    public LeafAlloc updateMaxIdByCustomStepAndGetLeafAlloc(LeafAlloc leafAlloc) {
        mapper.updateMaxIdByCustomStep(leafAlloc);
        return mapper.getLeafAlloc(leafAlloc.getKey()) ;
    }

    @Override
    public List<String> getAllTags() {
        return mapper.getAllTags();
    }
}
