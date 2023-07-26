package za.ac.cput.factory;

import za.ac.cput.domain.impl.Contacts;

import java.util.List;
import java.util.Random;

public class ContactsFactory {

    public Contacts create() {
        return new Contacts.Builder().build();
    }

    public static Contacts createContacts( String homePhoneNumber, String workPhoneNumber, String emailAddress) {
        return new Contacts.Builder()
                .setId(new Random().nextInt())
                .setHomePhoneNumber(homePhoneNumber)
                .setWorkPhoneNumber(workPhoneNumber)
                .setEmailAddress(emailAddress)
                .build();
    }
}
