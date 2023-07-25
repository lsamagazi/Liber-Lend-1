package za.ac.cput.service.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.impl.Contacts;
import za.ac.cput.factory.ContactsFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest
class ContactsServiceImplTest {
    private Contacts contacts;

    @Autowired

    private ContactsServiceImpl service;

    @BeforeEach
    public void setUp() {

        contacts = ContactsFactory.createContacts("0217562458", "0213657895", "info@woodstocklibrariy.com");
    }

    @Test
    public void a_testCreate(){

        Contacts created = service.create(contacts);
        //assertEquals(created, contacts.getId());
        assertNotNull(created);
        System.out.println("created: " + created);
    }
    @Test
    public void b_testRead() {

        Contacts read = service.read(contacts.getId());
        System.out.println("Read: " + read);
        assertNotNull(read);
    }
    @Test
    public void c_testUpdate(){

        Contacts updated = new Contacts.Builder().copy(contacts)
                .setEmailAddress("cwenga.dlova@gmail.com")
                .build();
        System.out.println("Updated: " + updated);
        assertNotEquals(updated, contacts);
    }
    @Test
    public void d_testDelete(){
    }

}