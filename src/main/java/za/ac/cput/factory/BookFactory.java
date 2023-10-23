package za.ac.cput.factory;
/**
 * BookFactory.java
 * Class for the BookFactory
 * Author: Peter Buckingham (220165289)
 * Date: 17 March 2021
 */





import org.springframework.stereotype.Component;
import za.ac.cput.domain.impl.Book;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookFactory {

    public Book createBook(int id, String title, String author, String publisher, String isbn, String imageLink, String description, String genre, String language, int edition) {
        return Book.builder()
                .id(id)
                .title(title)
                .author(author)
                .publisher(publisher)
                .isbn(isbn)
                .imageLink(imageLink)
                .description(description)
                .genre(genre)
                .language(language)
                .edition(edition)
                .build();
    }
}
