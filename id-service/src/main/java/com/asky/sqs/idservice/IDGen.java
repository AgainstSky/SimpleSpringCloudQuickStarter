package com.asky.sqs.idservice;

import com.asky.sqs.idservice.common.Result;

public interface IDGen {
    Result get(String key);
    boolean init();
}
