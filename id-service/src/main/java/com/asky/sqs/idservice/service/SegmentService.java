package com.asky.sqs.idservice.service;


import com.asky.sqs.idservice.IDGen;
import com.asky.sqs.idservice.common.Result;
import com.asky.sqs.idservice.exception.InitException;
import com.asky.sqs.idservice.segment.impl.SegmentIDGenImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SegmentService {

    private Logger logger = LoggerFactory.getLogger(SegmentService.class);

    private IDGen idGen;

    @Autowired
    public SegmentService(IDGen idGen) throws InitException {
        this.idGen = idGen;
        if (idGen.init()) {
            logger.info("Segment Service Init Successfully");
        } else {
            throw new InitException("Segment Service Init Fail");
        }
    }

    public Result getId(String key) {
        return idGen.get(key);
    }

    public SegmentIDGenImpl getIdGen() {
        if (idGen instanceof SegmentIDGenImpl) {
            return (SegmentIDGenImpl) idGen;
        }
        return null;
    }
}
