package com.asky.qsq.common;

import com.asky.qsq.common.em.IDStatus;
import lombok.Data;

@Data
public class IDResult {
    private long id;
    private IDStatus status;

    public IDResult() {

    }
    public IDResult(long id, IDStatus status) {
        this.id = id;
        this.status = status;
    }

}
