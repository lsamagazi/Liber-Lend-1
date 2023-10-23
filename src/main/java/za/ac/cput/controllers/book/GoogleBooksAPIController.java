package za.ac.cput.controllers.book;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Base64;

@RestController
@RequestMapping("/api/books/details")
public class GoogleBooksAPIController {
   // @GetMapping("/covers/{isbn}")
   /* public ResponseEntity<String> getBookCover(@PathVariable String isbn) {
        try{  // Construct the URL to the Google Books API
            String apiUrl = "https://www.googleapis.com/books/v1/volumes?q=isbn:" + isbn;
            // Create a RestTemplate
            RestTemplate restTemplate = new RestTemplate();
            // Call Google Books API and get response
          //  ResponseEntity<JsonNode> apiResponse = restTemplate.getForEntity(apiUrl, JsonNode.class);
            ResponseEntity<String> apiResponse = restTemplate.getForEntity(apiUrl, String.class);

            // Get cover image binary data
            byte[] imageBytes = apiResponse.getBody()
                    .get("volumeInfo")
                    .get("imageLinks")
                    .get("thumbnail")
                    .binaryValue();

            // Convert to base64 string
            String base64Image = Base64.getEncoder().encodeToString(imageBytes);

            return ResponseEntity.ok(base64Image);
    } catch (Exception e) {
        // Handle any exceptions, e.g., network errors
        System.out.println("Error occurred: " + e.getMessage());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);

        }

    }*/
}








    /* public ResponseEntity<Object> getBookDetailsByISBN(@PathVariable String isbn) {
        try {
            // Construct the URL to the Google Books API
            String apiUrl = "https://www.googleapis.com/books/v1/volumes?q=isbn:" + isbn;

            // Create a RestTemplate
            RestTemplate restTemplate = new RestTemplate();

            // Make a GET request to the Google Books API and get the JSON response
            ResponseEntity<Object> responseEntity = restTemplate.getForEntity(apiUrl, Object.class);

            // Return the Google Books API response as is
            System.out.println(responseEntity);
            return responseEntity;


        } catch (Exception e) {
            // Handle any exceptions, e.g., network errors
            System.out.println("Error occurred: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }*/
//}
