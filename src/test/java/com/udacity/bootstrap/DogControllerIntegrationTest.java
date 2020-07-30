package com.udacity.bootstrap;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.*;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class DogControllerIntegrationTest {

    @LocalServerPort
    public int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void getAllDogs(){
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setBasicAuth("username", "password");
        HttpEntity request = new HttpEntity(httpHeaders);

        ResponseEntity<List> response = this.restTemplate
                .exchange("http://localhost:" + port + "/dogs/", HttpMethod.GET, request, List.class);
        assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));
    }

}
