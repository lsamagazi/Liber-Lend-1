/*
package za.ac.cput.factory;

import za.ac.cput.domain.impl.Publisher;
import za.ac.cput.factory.IFactory;
import java.util.List;
import java.util.Random;

public class PublisherFactory implements IFactory<Publisher> {
    public static Publisher createPublisher(String firstName){//, String lastName, String publisherNo) {
        return new Publisher.Builder()
                .setId(new Random().nextInt(1000))
                .setFirstName(firstName)
                //.setLastName(lastName)
                //.setPublisherNo(publisherNo)
                .build();
    }
    @Override
    public Publisher create() {
        return new Publisher.Builder()
                .setId(new Random().nextInt(1000))
                .setFirstName("Sanelisiwe")
                //.setLastName("Hlazo")
                //.setPublisherNo("0607641522")
                .build();
    }

    @Override
    public Publisher getById(long id) {
        return null;
    }

    @Override
    public Publisher update(Publisher entity) {
        return null;
    }

    @Override
    public boolean delete(Publisher entity) {
        return false;
    }

    @Override
    public List<Publisher> getAll() {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public Class<Publisher> getType() {
        return null;
    }
}
*/
