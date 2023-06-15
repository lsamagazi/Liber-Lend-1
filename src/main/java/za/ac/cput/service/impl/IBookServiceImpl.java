package za.ac.cput.service.impl;

import org.springframework.stereotype.Service;
import za.ac.cput.domain.impl.Book;
import za.ac.cput.domain.impl.User;
import za.ac.cput.repository.IBookRepository;
import za.ac.cput.repository.IUserRepository;
import za.ac.cput.service.IBookService;
import za.ac.cput.service.IUserService;

import java.util.ArrayList;
import java.util.Collections;

@Service("bookServiceImpl")
public class IBookServiceImpl implements IBookService {
    private IBookRepository repository = null;


    private IBookServiceImpl(IBookRepository repository) {

        this.repository = repository;
    }


    @Override
    public Book create(Book book) {
        return this.repository.save(book);

    }

    @Override
    public Book read(Integer integer) {

        return (Book) this.repository.findAllById(Collections.singleton(Long.valueOf(integer)));

    }

    @Override
    public Book read(int id) {

        return (Book) this.repository.findAllById(Collections.singleton((long) id));
    }

    @Override
    public Book update(Book book) {
        if (this.repository.existsById((long) book.getId()))
            return this.repository.save(book);
        return null;
    }

    @Override
    public boolean delete(int id) {
        if (this.repository.existsById((long) id)) {
            this.repository.deleteById((long) id);
            return true;
        }
        return false;
    }

    public boolean delete(Integer id) {
        if (this.repository.existsById(Long.valueOf(id))) {
            this.repository.deleteById(Long.valueOf(id));
            return true;
        }
        return false;
    }

    @Override
    public ArrayList<Book> getAll() {
        return (ArrayList<Book>) this.repository.findAll();
    }


    ///////////


}
