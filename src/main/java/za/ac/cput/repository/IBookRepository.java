package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.impl.Book;
import za.ac.cput.domain.impl.User;

@Repository
public interface IBookRepository extends JpaRepository<Book, Integer> {
    // Add additional methods as we need them

}
