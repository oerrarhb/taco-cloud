package com.othmane.oertacocloud.controllers;



import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


@RunWith(SpringRunner.class)
@WebMvcTest(HomeController.class)
public class HomeControllerTest extends MockMvcRequestBuilders {

    @Autowired
    private MockMvc mockMvc;


    @Test
    public void testHomePage() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("home"))
                .andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("Welcome to ....")));
    }
}
