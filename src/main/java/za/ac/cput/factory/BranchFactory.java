package za.ac.cput.factory;

import za.ac.cput.domain.impl.Address;
import za.ac.cput.domain.impl.Branch;
import za.ac.cput.domain.impl.Contacts;

import java.util.List;
import java.util.Random;

public class BranchFactory {
    public Branch create() {
        return new Branch.Builder().build();
    }

    public static Branch createBranch(String name, Contacts contacts, Address address, String availableItems){
        return new Branch.Builder()
                .setId(new Random().nextInt())
                .setName(name)
                .setContacts(contacts)
                .setAddress(address)
                .setAvailableItems(availableItems)
                .build();
    }
}
