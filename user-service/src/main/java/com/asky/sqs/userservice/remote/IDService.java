package com.asky.sqs.userservice.remote;

import com.asky.qsq.common.IDResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description:
 * @author: AgainstSky
 * @create: 2022-05-19 15:44
 **/
@FeignClient("id-service")
public interface IDService {

    @GetMapping("id/segment")
    IDResult getSegmentID(@RequestParam String key);

}
