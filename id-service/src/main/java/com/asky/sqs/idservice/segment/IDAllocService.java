package com.asky.sqs.idservice.segment;



import com.asky.sqs.idservice.segment.model.LeafAlloc;

import java.util.List;

public interface IDAllocService {
     List<LeafAlloc> getAllLeafAllocs();
     LeafAlloc updateMaxIdAndGetLeafAlloc(String tag);
     LeafAlloc updateMaxIdByCustomStepAndGetLeafAlloc(LeafAlloc leafAlloc);
     List<String> getAllTags();
}
