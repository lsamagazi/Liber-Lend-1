package za.ac.cput.controllers.book;
/**
 * CarController.java
 * This is the controller for the Car class
 * Author: Peter Buckingham (220165289)
 * Date: 05 April 2023
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.domain.impl.Book;
import za.ac.cput.service.impl.BookServiceImpl;
import za.ac.cput.service.impl.RentalServiceImpl;

import java.util.ArrayList;
import java.util.List;


@RestController


//set url
@CrossOrigin(origins = "http://localhost:5173")
public class BookController {

    @Autowired
    private BookServiceImpl bookService;

    @Autowired
    private RentalServiceImpl rentalService;

    @GetMapping("/api/books/all")
    public List<Book> getAllBooks() {
        List<Book> allBooks = new ArrayList<>(bookService.getAll());
        return allBooks;
    }
//    @GetMapping("/api/cars/list/available/all")
//    public List<Car> getAllAvailableCars() {
//        List<Car> allCars = new ArrayList<>(carService.getAll());
//        allCars.removeIf(car -> !rentalService.isCarAvailableByCarId(car));
//        return allCars;
//    }



   @GetMapping("/api/books/list/nonfiction")
    public List<Book> getNonFictionBooks() {
        List<Book> nonfictionBooks = new ArrayList<>(bookService.getBookByGenre("Non-Fiction"));
       nonfictionBooks.removeIf(book -> !book.getGenre().equals("Non-Fiction"));
        return nonfictionBooks;
    }

    @GetMapping("/api/books/list/fiction")
    public List<Book> getFictionBooks() {
        List<Book> fictionBooks = new ArrayList<>(bookService.getBookByGenre("Fiction"));
        fictionBooks.removeIf(book -> !book.getGenre().equals("Fiction"));
        return fictionBooks;
    }

    @GetMapping("/api/books/list/mystery")
    public List<Book> getMysteryBooks() {
        List<Book> mysteryBooks = new ArrayList<>(bookService.getBookByGenre("Mystery"));
        mysteryBooks.removeIf(book -> !book.getGenre().equals("Mystery"));
        return mysteryBooks;
    }
//    @GetMapping("/api/cars/list/available/all")
//    public List<Car> getAllAvailableCars() {
//        List<Car> allCars = new ArrayList<>(carService.getAll());
//        allCars.removeIf(car -> !rentalService.isCarAvailableByCarId(car));
//        return allCars;
//    }

    @GetMapping("/api/books/list/available/all")
    public List<Book> getAllAvailable() {
        List<Book> allBooks = new ArrayList<>(bookService.getAll());
        allBooks.removeIf(book -> !rentalService.isBookAvailableByBookId(book));
        return allBooks;
    }

    @GetMapping("/api/books/list/available/nonfiction")
    public List<Book> getAllAvailableNonFictionBooks() {
        List<Book> nonfictionBooks = new ArrayList<>(bookService.getBookByGenre("Non-Fiction"));
        nonfictionBooks.removeIf(book -> !book.getGenre().equals("Non-Fiction"));
        nonfictionBooks.removeIf(book -> !rentalService.isBookAvailableByBookId(book));

        //nonfictionBooks.removeIf(book -> book.getGenre() != "Non-Fiction" || !rentalService.isBookAvailableByBookId(book));
        System.out.println("Non-fiction books: " + nonfictionBooks);
        return nonfictionBooks;
    }
    @GetMapping("/api/books/list/available/fiction")
    public List<Book> getAllAvailableFictionBooks() {
        List<Book> fictionBooks = new ArrayList<>(bookService.getBookByGenre("Fiction"));
        fictionBooks.removeIf(book -> !book.getGenre().equals("Fiction"));
        fictionBooks.removeIf(book -> !rentalService.isBookAvailableByBookId(book));
        //fictionBooks.removeIf(book -> book.getGenre() != "Fiction" || !rentalService.isBookAvailableByBookId(book));
        System.out.println("Fiction books: " + fictionBooks);
        return fictionBooks;
    }
    @GetMapping("/api/books/list/available/mystery")
    public List<Book> getAvailableMysteryBooks() {
        List<Book> mysteryBooks = new ArrayList<>(bookService.getBookByGenre("Mystery"));
        mysteryBooks.removeIf(book -> !book.getGenre().equals("Mystery"));
        mysteryBooks.removeIf(book -> !rentalService.isBookAvailableByBookId(book));
        System.out.println("Mystery books: " + mysteryBooks);
        if (mysteryBooks.isEmpty()) {
            System.out.println("No mystery books available");
           // throw new RuntimeException("No mystery books available");
        }
        //mysteryBooks.removeIf(book -> book.getGenre() != "Mystery" || !rentalService.isBookAvailableByBookId(book));
        return mysteryBooks;
    }
}
