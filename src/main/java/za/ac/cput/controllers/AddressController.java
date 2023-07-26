package za.ac.cput.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.impl.Address;
import za.ac.cput.service.impl.AddressServiceImpl;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reservations")
public class AddressController {

    @Autowired
    private AddressServiceImpl addressService;

    @PostMapping("/createAddress")
    public Address create(@RequestBody Address address){

        return addressService.create(address);
    }
   /** @GetMapping("/read/{id}")
    public ResponseEntity<Address> read(@PathVariable int id){
        Optional readAddress = this.addressService.read(id);
        //return ResponseEntity.ok(readAddress);

    }*/

   @PostMapping("/update/")
    public Address updated(@RequestBody Address address){
       return addressService.update(address);
   }

   @DeleteMapping("delete/{id}")
    public boolean delete(@PathVariable int id){
       return addressService.deleteById(id);
   }
    @RequestMapping({"/getall"})
    public List<Address> getAll() {
       return addressService.findAll();
    }

}
