package com.asky.sqs.idservice.conrtoller;

import com.asky.sqs.idservice.IDGen;
import com.asky.sqs.idservice.common.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: AgainstSky
 * @create: 2022-05-17 16:07
 **/
@RestController
@RequestMapping("id")
public class IDController {

    @Autowired
    IDGen idGen;

    @GetMapping("/segment")
    public Result getSegmentID(@RequestParam String key){
        return idGen.get(key);
    }

}
