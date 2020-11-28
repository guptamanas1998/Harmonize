package com.harmonize.task.controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
public class PingControllerUnitTests {

    PingController pingController = new PingController();

    @Test
    public void testPing() {
        Map<String, String> result = pingController.ping();
        assertThat(result).isNotNull();
        assertThat(result.get("data")).isEqualTo("pong");
    }
}
