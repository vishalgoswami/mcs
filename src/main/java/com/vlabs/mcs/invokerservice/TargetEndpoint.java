package com.vlabs.mcs.invokerservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/targetendpoints")
public class TargetEndpoint {

    @GetMapping("/v1.0/target1")
    public String target1(){
        return "response1";
    }
    @GetMapping("/v1.0/target2")
    public String target2(){
        return "response2";
    }
    @GetMapping("/v1.0/target3")
    public String target3(){
        return "response3";
    }
}
