package com.harmonize.task.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import static com.harmonize.task.constants.ApiConstants.PING_PATH;

@RestController
@RequestMapping(PING_PATH)
public class PingController {

    private final Map<String, String> pingResponse = new HashMap<String, String>(){{
        put("data", "pong");
    }};

    @RequestMapping(method = RequestMethod.GET)
    public Map<String, String> ping() {
        return pingResponse;
    }

}