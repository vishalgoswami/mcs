package com.vlabs.mcs.invokerservice;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;

@Service
public class TargetService {
    private static HashMap<String, String> targets = new HashMap<String, String>();
    static{
        targets.put("t1","http://localhost:8080/api/targetendpoints/v1.0/target1");
        targets.put("t2","http://localhost:8080/api/targetendpoints/v1.0/target2");
        targets.put("t3","http://localhost:8080/api/targetendpoints/v1.0/target3");
    }

    public Collection<String> getTargets() {
        return targets.values();
    }
}
