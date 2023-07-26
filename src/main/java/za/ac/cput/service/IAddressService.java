package za.ac.cput.service;


import za.ac.cput.domain.impl.Address;

import java.util.List;
import java.util.Optional;

public interface IAddressService{

    Address create(Address address);

    Optional read(int id);

    Address update(Address address);

    boolean deleteById(int id);

    List<Address> findAll();
  /**  Address create(Address address);
    Optional read(int id);

    Address update(za.ac.cput.domain.impl.Address address);

    boolean delete(int id);

    List<Address> findAllAddress();*/
}
