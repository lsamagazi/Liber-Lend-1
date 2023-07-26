package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.impl.Address;
import za.ac.cput.repository.AddressRepository;
import za.ac.cput.service.IAddressService;

import java.util.List;
import java.util.Optional;

@Service
public class AddressServiceImpl implements IAddressService {

    @Autowired
    private AddressRepository repository;

    @Autowired
    public AddressServiceImpl(AddressRepository repository) {
        this.repository = repository;
    }


    @Override
    public Address create(Address address) {
        return this.repository.save(address);
    }

    @Override
    public Optional read(int id) {
        return this.repository.findById(id);
    }

    @Override
    public Address update(Address address) {
        if (this.repository.existsById(address.getId()))
            this.repository.save(address);
        return null;
    }

    @Override
    public boolean deleteById(int id) {
        if (this.repository.existsById(id)){
            this.repository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public List<Address> findAll() {
        return this.repository.findAll();
    }
}
