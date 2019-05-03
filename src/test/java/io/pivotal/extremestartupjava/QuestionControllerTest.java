package io.pivotal.extremestartupjava;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@RunWith(SpringRunner.class)
@WebMvcTest
public class QuestionControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void shoudlReplyToWhatIsYourName() throws Exception {
        mockMvc.perform(get("/").param("q", "what is your name")).andExpect(
                content().string(equalTo("TeamJava"))
        );
    }
}
