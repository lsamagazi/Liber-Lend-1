package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.domain.impl.Contacts;

public interface IContactsRepository extends JpaRepository<Contacts, Integer> {

}
