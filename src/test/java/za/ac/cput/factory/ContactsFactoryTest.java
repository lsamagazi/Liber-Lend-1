package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.impl.Contacts;

import static org.junit.jupiter.api.Assertions.*;

class ContactsFactoryTest {

    @Test
    void testContactsFactory() {

        ContactsFactory contactsFactory = new ContactsFactory();
        Contacts contacts = contactsFactory.createContacts("021 456 7892", "021 789 1234", "info@cptlibrary.com");

        assertNotNull(contacts);
        assertNotNull(contacts.getId());


    }

}