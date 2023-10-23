/*
package za.ac.cput.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.impl.Author;
import za.ac.cput.factory.AuthorFactory;
import za.ac.cput.service.IAuthorService;

import java.util.List;

@RestController
@RequestMapping("/branch")
public class AuthorController {
    @Autowired
    private IAuthorService authorService;

    @PostMapping("/create")
    public Author create(@RequestBody Author author){
        //Branch branchCreated = BranchFactory.createBranch(branch.getBranchName());
        Author newAuthor = AuthorFactory.createAuthor(author.getFirstName());
        //"CapeGate Branch",null,"215092317@mycput.ac.za");
        return authorService.create(newAuthor);
        //return branchService.create(branchCreated);

    }
    @GetMapping("/read/{id}")
    public Author read(@PathVariable Integer id){
        return authorService.read(id);
    }
    @PostMapping("/update/")
    public Author update(@RequestBody Author author){
        return authorService.update(author);
    }
    @DeleteMapping("delete/{id}")
    public boolean delete(@PathVariable Integer id){
        return authorService.delete(id);
    }

    @RequestMapping({"/getall"})
    public List<Author> getall(){
        return authorService.getAll();
    }
}
*/
