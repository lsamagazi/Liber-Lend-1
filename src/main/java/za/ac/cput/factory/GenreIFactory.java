package za.ac.cput.factory;


import za.ac.cput.domain.impl.Book;
import za.ac.cput.domain.impl.Genre;

import java.util.List;
import java.util.Random;

public class GenreIFactory implements IFactory<Genre>{
    public static Genre createGenre(String genreName, String description, Genre relatedGenre, Book exampleBook) {

        Random random = new Random();
        int genreId = random.nextInt(1000000);

        return new Genre.Builder()
                .setGenreId(genreId)
                .setGenreName(genreName)
                .setDescription(description)
                .setRelatedGenre(relatedGenre)
                .setExampleBook(exampleBook)
                .Build();
    }
    @Override
    public Genre create() {
        return new Genre.Builder().Build();
    }

    @Override
    public Genre getById(long id) {
        return null;
    }

    @Override
    public Genre update(Genre entity) {
        return null;
    }

    @Override
    public boolean delete(Genre entity) {
        return false;
    }

    @Override
    public List<Genre> getAll() {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public Class<Genre> getType() {
        return null;
    }






}
