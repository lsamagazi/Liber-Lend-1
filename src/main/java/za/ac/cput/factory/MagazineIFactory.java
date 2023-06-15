package za.ac.cput.factory;

import za.ac.cput.domain.impl.Magazine;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * MagazineFactory.java
 * Class for the MagazineFactory
 * Author: Peter Buckingham (220165289)
 * Date: 19 March 2021
 */



public class MagazineIFactory implements IFactory<Magazine> {

    @Override
    public Magazine create() {
        return new Magazine.MagazineBuilder().build();
    }

    @Override
    public Magazine getById(long id) {
        return null;
    }

    public Optional<Magazine> findById(long id) {
        // implementation for finding magazine by id
        return Optional.empty();
    }

    public List<Magazine> findAll() {
        // implementation for finding all magazines
        return Collections.emptyList();
    }

    @Override
    public Magazine update(Magazine entity) {
        // implementation for updating a magazine
        return null;
    }

    @Override
    public boolean delete(Magazine entity) {
        // implementation for deleting a magazine
        return false;
    }

    @Override
    public List<Magazine> getAll() {
        return null;
    }

    @Override
    public long count() {
        // implementation for counting the number of magazines
        return 0;
    }

    @Override
    public Class<Magazine> getType() {
        return null;
    }
}