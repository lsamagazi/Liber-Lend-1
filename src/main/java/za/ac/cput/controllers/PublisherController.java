package za.ac.cput.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.impl.Publisher;
import za.ac.cput.factory.PublisherFactory;
import za.ac.cput.service.IPublisherService;

import java.util.List;
@RestController
@RequestMapping("/branch")
public class PublisherController {
    @Autowired
    private IPublisherService publisherService;

    @PostMapping("/create")
    public Publisher create(@RequestBody Publisher publisher){
        //Branch branchCreated = BranchFactory.createBranch(branch.getBranchName());
        Publisher newPublisher = PublisherFactory.createPublisher(publisher.getFirstName());
        //"CapeGate Branch",null,"215092317@mycput.ac.za");
        return publisherService.create(newPublisher);
        //return branchService.create(branchCreated);

    }
    @GetMapping("/read/{id}")
    public Publisher read(@PathVariable Integer id){
        return publisherService.read(id);
    }
    @PostMapping("/update/")
    public Publisher update(@RequestBody Publisher publisher){
        return publisherService.update(publisher);
    }
    @DeleteMapping("delete/{id}")
    public boolean delete(@PathVariable Integer id){
        return publisherService.delete(id);
    }

    @RequestMapping({"/getall"})
    public List<Publisher> getall(){
        return publisherService.getAll();
    }
}
