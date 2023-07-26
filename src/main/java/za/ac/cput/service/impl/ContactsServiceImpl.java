package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.impl.Contacts;
import za.ac.cput.repository.IContactsRepository;
import za.ac.cput.service.IContactsService;

import java.util.Collections;
import java.util.List;
@Service
public class ContactsServiceImpl implements IContactsService {

    @Autowired
    private IContactsRepository repository;
    private ContactsServiceImpl(IContactsRepository repository){
        this.repository = repository;
    }

    @Override
    public Contacts create(Contacts contacts) {
        return this.repository.save(contacts);
    }

    @Override
    public Contacts read(Integer integer) {
        return (Contacts) this.repository.findAllById(Collections.singleton(integer));
    }

    @Override
    public Contacts update(Contacts contacts) {
        if (this.repository.existsById(contacts.getId()))
            return this.repository.save(contacts);
        return null;
    }

    @Override
    public boolean delete(Integer integer) {
        return false;
    }


    @Override
    public boolean deleteByID(int id) {
        if (this.repository.existsById(id)) {
            this.repository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public List<Contacts> findAll() {
        return this.repository.findAll();
    }
}
