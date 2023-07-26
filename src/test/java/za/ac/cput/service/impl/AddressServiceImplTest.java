package za.ac.cput.service.impl;

import net.minidev.json.JSONUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.impl.Address;
import za.ac.cput.factory.AddressFactory;
import za.ac.cput.repository.AddressRepository;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class AddressServiceImplTest {

    private Address address;

    @Autowired
    private AddressServiceImpl service;

    @Autowired @Mock
    private AddressRepository repository;

    @BeforeEach
    public void setUp() {

        this.address = AddressFactory.createAddress("26", "Strand Street", "Kloof", "Cape Town", 7560);
        Address saved = this.service.create(this.address);
        assertEquals(this.address, saved);

    }

    @Test
    void testCreate() {
        Address saved = this.service.create(this.address);
        assertEquals(this.address, saved);
        assertNotNull(saved);
        System.out.println("Created: " + saved);
    }

    @Test
    void testRead(){
        Optional<Address> read = this.service.read(address.getId());
        assertTrue(read.isPresent());
        assertEquals(address, read.get());
        System.out.println("Read: " + read);
   }

 /**  @Test
    void testUpdate(){
        //Address updated = this.service.update()
   }*/
   @Test
    void deleteById() {
        this.service.deleteById(address.getId());
       List<Address> addressList = this.service.findAll();
       assertEquals(0, addressList.size());
   }

   @Test
    void testFindAll(){
       List<Address> list = this.service.findAll();
       System.out.println("\nShow all: " + list);
   }




}