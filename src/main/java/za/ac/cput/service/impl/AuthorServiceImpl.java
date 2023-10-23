/*
package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.impl.Author;
import za.ac.cput.repository.IAuthorRepository;
import za.ac.cput.service.IAuthorService;

import java.util.List;


@Service
public class AuthorServiceImpl implements IAuthorService {
    private IAuthorRepository repository;
    @Autowired
    private AuthorServiceImpl(IAuthorRepository repository){

        this.repository=repository;
    }


    @Override
    public Author create(Author author) {
        return this.repository.save(author);
    }

    @Override
    public Author read(Integer id) {
        return this.repository.findById(id).orElse(null);
    }

    @Override
    public Author update(Author author) {
        if(this.repository.existsById(Author.getId()))
            return this.repository.save(author);
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        if(this.repository.existsById(id)){
            this.repository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public List<Author> getAll() {
        return this.repository.findAll();
    }

}
*/
