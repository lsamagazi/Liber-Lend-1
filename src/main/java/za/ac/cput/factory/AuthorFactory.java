package za.ac.cput.factory;

import za.ac.cput.domain.impl.Author;
import za.ac.cput.domain.impl.Publisher;

import java.util.List;
import java.util.Random;

public class AuthorFactory implements IFactory<Author> {
    public static Author createAuthor(String firstName){//, String lastName, String publisherNo) {
        return new Author.Builder()
                .setId(new Random().nextInt(1000))
                .setFirstName(firstName)
                //.setLastName(lastName)
                //.setPublisherNo(publisherNo)
                .build();
    }

    @Override
    public Author create() {
        return new Author.Builder()
                .setId(new Random().nextInt(100000))
                .setFirstName("Asiphe")
                .setLastName("Funda")
                .setBiography("Asiphe Funda Author of MY LIFE MY RULES")
                .build();
    }

    @Override
    public Author getById(long id) {
        return null;
    }

    @Override
    public Author update(Author entity) {
        return null;
    }

    @Override
    public boolean delete(Author entity) {
        return false;
    }

    @Override
    public List<Author> getAll() {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public Class<Author> getType() {
        return null;
    }
}