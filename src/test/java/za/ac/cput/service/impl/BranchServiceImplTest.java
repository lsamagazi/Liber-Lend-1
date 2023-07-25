/**package za.ac.cput.service.impl;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.impl.Address;
import za.ac.cput.domain.impl.Branch;
import za.ac.cput.domain.impl.Contacts;
import za.ac.cput.factory.AddressFactory;
import za.ac.cput.factory.BranchFactory;
import za.ac.cput.factory.ContactsFactory;
import za.ac.cput.repository.IBranchRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class BranchServiceImplTest {

    private Branch branch;
    private Address address;
    private Contacts contacts;

    @Autowired
    private BranchServiceImpl branchService;
    @Autowired
    private AddressServiceImpl addressService;
    @Autowired
    private ContactsServiceImpl contactsService;

    @Autowired
    private IBranchRepository repository;

    @BeforeEach
    public void startUp(){
        contacts = ContactsFactory.createContacts("0795321647", "0217893698", "info@gardenslibrary.com");
        address = AddressFactory.createAddress("29", "Kloof street", "Gardens", "Cape Town", 8001);
        branch = BranchFactory.createBranch("Gardens", contacts, address, "125 Books.");
    }

    @Test
    @Order(1)
    public void save(){

        Branch created = branchService.save(branch);
        assertEquals(branch.getId(), created.getId());
        System.out.println("created: " + created);
    }
    @Test
    @Order(2)
    public void update(){

        Branch newBranch = new Branch.Builder().copy(branch).setAvailableItems("130 Books.").build();
        Branch updated = branchService.update(newBranch);
        assertEquals(newBranch.getAvailableItems(), updated.getAvailableItems());
        System.out.println("Updated: " + updated);
    }
    @Test
    @Order(3)
    public void delete() {
        branchService.delete(branch.getId());
        List<Branch> branchList = branchService.getAll();
        assertEquals(0, branchList.size());
    }
    @Test
    @Order(4)
    public void getAll() {
        System.out.println("Get All: ");
        System.out.println(branchService.getAll());
    }


}
 */