package za.ac.cput.controllers;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import za.ac.cput.domain.impl.Address;
import za.ac.cput.factory.AddressFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class AddressControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private final String baseURL = "http://localhost:8080/reservations";
    private Address address = AddressFactory.createAddress("7239", "Adderly street", "Gardens", "Cape Town", 8001);
    @Test
    void a_create() {

        String url = baseURL + "/create";
        ResponseEntity<Address> postResponse = restTemplate.postForEntity(url, address, Address.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        Address newAddress = postResponse.getBody();
        System.out.println("saved: " + newAddress);
        assertEquals(address.getId(), postResponse.getBody().getId());
    }

    @Test
    void b_read(){
        String url = baseURL + "/read/" + address.getId();
        System.out.println("URL: " + url);
        ResponseEntity<Address> response = restTemplate.getForEntity(url, Address.class);
        assertEquals(address.getId(), response.getBody().getId());
        System.out.println(response.getBody());
    }

    @Test
    void c_update(){
        Address updated = new Address.Builder().copy(address)
                .setStrName("Strand street").build();
        String url = baseURL + "/update/";
        System.out.println("URL: " + url);
        System.out.println("post data: " + updated);
        ResponseEntity<Address> response = restTemplate.postForEntity(url, updated, Address.class);
        assertNotNull(response.getBody());
    }

    @Test
    void d_delete() {

        String url = baseURL + "/delete/" + address.getId();
        System.out.println("URL: " + url);
        restTemplate.delete(url);
    }
    @Test
    void e_getAll() {

        String url = baseURL + "/getAll/";
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<Integer> entity = new HttpEntity<>(null, headers);
        ResponseEntity<Integer> response = restTemplate.exchange(url, HttpMethod.GET, entity, Integer.class);
        System.out.println("show All: ");
        System.out.println(response);
        System.out.println(response.getBody());
    }
}