package za.ac.cput.factory;
/**
 * BookFactory.java
 * Class for the BookFactory
 * Author: Peter Buckingham (220165289)
 * Date: 17 March 2021
 */



import za.ac.cput.domain.impl.Book;

import java.util.ArrayList;
import java.util.List;


public class BookIFactory{
    private final List<Book> books;
    private int nextId;

    public BookIFactory() {
        books = new ArrayList<>();
        nextId = 1;
    }


    public Book create() {
        return new Book.Builder("", null, null, "").build();
    }


    public Book getById(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }


    public Book update(Book entity) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == entity.getId()) {
                books.set(i, entity);
                return entity;
            }
        }
        return null;
    }


    public boolean delete(Book entity) {
        return books.remove(entity);
    }


    public List<Book> getAll() {
        return new ArrayList<>(books);
    }


    public long count() {
        return books.size();
    }


    public Class<Book> getType() {
        return null;
    }


    public Book create(Book entity) {
        entity.setId(nextId++);
        books.add(entity);
        return entity;
    }
}