package com.harmonize.task.controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static com.harmonize.task.constants.ApiConstants.PING_PATH;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(PingController.class)
public class PingControllerIntegrationTests {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testPing() throws Exception {
        mvc.perform(get(PING_PATH))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.data", is("pong")));
        }

}