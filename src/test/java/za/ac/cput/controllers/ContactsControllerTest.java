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
import za.ac.cput.domain.impl.Contacts;
import za.ac.cput.factory.ContactsFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class ContactsControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private final String baseURL = "http://localhost:8080/reservations";

    private Contacts contacts = ContactsFactory.createContacts("0787325641", "0218793654","ixxyzet@gmail.com");

    @Test
    void a_TestCreate() {

        String url = baseURL + "/createContacts";
        ResponseEntity<Contacts> postResponse = restTemplate.postForEntity(url, contacts, Contacts.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        Contacts newContact = postResponse.getBody();
        System.out.println("saved: " + newContact);
        assertEquals(contacts.getId(), postResponse.getBody().getId());

    }
    @Test
    void b_TestRead() {

        String url = baseURL + "/read/" + contacts.getId();
        System.out.println("URL: " + url);
        ResponseEntity<Contacts> response = restTemplate.getForEntity(url, Contacts.class);
        assertEquals(contacts.getId(), response.getBody().getId());
        System.out.println(response.getBody());
    }
    @Test
    void c_TestUpdate() {

        Contacts updated = new Contacts.Builder().copy(contacts)
                .setHomePhoneNumber("0731244567").build();
        String url = baseURL + "/update/";
        System.out.println("URL: " + url);
        System.out.println("post data: " + updated);
        ResponseEntity<Contacts> response = restTemplate.postForEntity(url, updated, Contacts.class);

    }
    @Test
    void d_TestDelete(){
        String url = baseURL + "/delete/" + contacts.getId();
        System.out.println("URL: " + url);
        restTemplate.delete(url);
        /**
         *      String url = baseURL + "/delete/"+employee.getEmployeeNumber();
         *     System.out.println("URL: "+url);
         *     restTemplate.delete(url);
         */
    }
    @Test
    void e_TestGetAll() {
        String url = baseURL + "/getAll";
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<Integer> entity = new HttpEntity<>(null, headers);
        ResponseEntity<Integer> response = restTemplate.exchange(url, HttpMethod.GET, entity, Integer.class);
        System.out.println("Show All: ");
        System.out.println(response);
        System.out.println(response.getBody());
    }

}