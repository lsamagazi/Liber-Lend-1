package za.ac.cput.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.impl.Contacts;
import za.ac.cput.service.impl.ContactsServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/reservations")
public class ContactsController {

    private ContactsServiceImpl contactsService;

    @Autowired
    public ContactsController(ContactsServiceImpl service) {
        this.contactsService = service;
    }

    @PostMapping("/createContacts")
    public Contacts create(@RequestBody Contacts contacts){

        return contactsService.create(contacts);
    }

    @GetMapping("readContacts/{id}")
    public ResponseEntity<Contacts> read(@PathVariable int id){
        Contacts readContacts = this.contactsService.read(id);
        return ResponseEntity.ok(readContacts);

    }
    @PostMapping("/updateContacts")
    public Contacts update(@RequestBody Contacts contacts){
        return contactsService.update(contacts);
    }
    @DeleteMapping("deleteContacts/{id}")
    public ResponseEntity<Boolean> deleteById(@PathVariable int id){
        this.contactsService.deleteByID(id);
        return ResponseEntity.noContent().build();
    }
    @GetMapping("/allContacts")
    public ResponseEntity<List<Contacts>> getAll() {
        List<Contacts> contactsList = this.contactsService.findAll();
        return ResponseEntity.ok(contactsList);
    }
}
