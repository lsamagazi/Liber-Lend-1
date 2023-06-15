package za.ac.cput.factory;
/**
 * CatologueFactory.java
 * Class for the Catologue Factory
 * Author: Shamiso Moyo Chaka(220365393)
 * Date: 26 March 2021
 */

import za.ac.cput.domain.impl.Catologue;

import java.util.List;
public class CatologueFactory implements IFactory <Catologue> {

    public static Catologue createCatologue(String Title, String Author, String Publisher, String ISBN, String reviews, String Description) {

        return new Catologue.Builder()
                .setTitle(Title)
                .setAuthor(Author)
                .setPublisher(Publisher)
                .setISBN(ISBN)
                .setreviews(reviews)
                .setDescription(Description)
                .Build();

}

    @Override
    public Catologue create() {
        return null;
    }

    @Override
    public Catologue getById(long id) {
        return null;
    }

    @Override
    public Catologue update(Catologue entity) {
        return null;
    }

    @Override
    public boolean delete(Catologue entity) {
        return false;
    }

    @Override
    public List<Catologue> getAll() {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public Class<Catologue> getType() {
        return null;
    }
}
