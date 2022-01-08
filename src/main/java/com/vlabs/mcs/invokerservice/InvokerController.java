package com.vlabs.mcs.invokerservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;


@RestController
@RequestMapping("/api")
public class InvokerController {

    private static final Logger LOGGER = LoggerFactory.getLogger(InvokerController.class);

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private TargetService targetService;

    @GetMapping("/v1.0/invoke")
    public String invokeHttpTargets(){

        Collection<String> uris = targetService.getTargets();

        for (String uri : uris) {
            LOGGER.info(String.format("Invoking URL = %s", uri));
            String result = restTemplate.getForObject(uri, String.class);
            LOGGER.info(String.format("Response = %s", result));
        }


        return "OK";
    }
}
