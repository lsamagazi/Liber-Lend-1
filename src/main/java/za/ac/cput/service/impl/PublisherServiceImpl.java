package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.impl.Publisher;
import za.ac.cput.repository.IPublisherRepository;
import za.ac.cput.service.IPublisherService;

import java.util.List;

@Service
public class PublisherServiceImpl implements IPublisherService {
    private IPublisherRepository repository;
    @Autowired
    private PublisherServiceImpl(IPublisherRepository repository){

        this.repository=repository;
    }


    @Override
    public Publisher create(Publisher publisher) {
        return this.repository.save(publisher);
    }

    @Override
    public Publisher read(Integer id) {
        return this.repository.findById(id).orElse(null);
    }

    @Override
    public Publisher update(Publisher publisher) {
        if(this.repository.existsById(Publisher.getId()))
            return this.repository.save(publisher);
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
    public List<Publisher> getAll() {
        return this.repository.findAll();
    }
}
