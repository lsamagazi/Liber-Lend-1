package za.ac.cput.service;

import za.ac.cput.domain.impl.Contacts;


import java.util.List;

public interface IContactsService extends IService<Contacts, Integer>{

    Contacts create(Contacts contacts);

    Contacts update(Contacts contacts);

     boolean deleteByID(int id);

    List<Contacts> findAll();
}
