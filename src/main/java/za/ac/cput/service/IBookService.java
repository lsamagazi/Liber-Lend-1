package za.ac.cput.service;

import za.ac.cput.domain.impl.Book;
import za.ac.cput.domain.impl.User;

import java.util.ArrayList;

public interface IBookService extends IService<Book, Integer> {
    Book create(Book book);

    Book read(int id);

    Book update(Book book);

    boolean delete(int id);

    ArrayList<Book> getAll();
}