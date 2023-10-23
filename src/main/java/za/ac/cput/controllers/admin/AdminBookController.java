package za.ac.cput.controllers.admin;
/**
 * CarController.java
 * This is the controller for the Car class
 * Author: Peter Buckingham (220165289)
 * Date: 05 April 2023
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.impl.Book;
import za.ac.cput.service.impl.BookServiceImpl;

import java.util.ArrayList;
import java.util.List;


@RestController
//set url
//@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/api/admin/books")
public class AdminBookController {

    @Autowired
    private BookServiceImpl bookService;

    @GetMapping ("/list/all")
    public List<Book> getBooks() {
        List<Book> allBooks = new ArrayList<>(bookService.getAll());
        return allBooks;
    }
    @PostMapping("/create")
    public Book create(@RequestBody Book bookCreationRequest) {
        // Extract the registration details from the request object
        System.out.println("BookController.create");
        String title = bookCreationRequest.getTitle();
        System.out.println("Title: " + title);
        String author = bookCreationRequest.getAuthor();
        System.out.println("Author: " + author);
        String publisher = bookCreationRequest.getPublisher();
        System.out.println("Publisher: " + publisher);
        String genre = bookCreationRequest.getGenre();
        System.out.println("Genre: " + genre);
        //isbn
        String isbn = bookCreationRequest.getisbn();
        System.out.println("ISBN: " + isbn);
        int edition = bookCreationRequest.getEdition();
        System.out.println("Edition: " + edition);
        String description = bookCreationRequest.getDescription();
        System.out.println("Description: " + description);


        System.out.println("This book is now created");
        Book createdBook = bookService.create(bookCreationRequest);
        return createdBook;


    }
    @PutMapping("/update/{id}")
    public Book update(@RequestBody Book bookUpdateRequest) {
        Book updatedBook = bookService.update(bookUpdateRequest);
        return updatedBook;
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
        System.out.println("ID: " + id);
        bookService.delete(id);
        System.out.println("This book is now deleted");
    }
    @GetMapping("/read/{id}")
    public Book read(@PathVariable int id) {
        System.out.println("ID: " + id);
        Book readBook = bookService.read(id);
        return readBook;
    }




}
