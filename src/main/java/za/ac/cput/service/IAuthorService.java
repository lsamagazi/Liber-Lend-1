package za.ac.cput.service;

import za.ac.cput.domain.impl.Author;

import java.util.List;

public interface IAuthorService {
    Author create(Author author);

    public Author read(Integer id);

    Author update(Author author);

    boolean delete(Integer id);

    List<Author> getAll();
}
