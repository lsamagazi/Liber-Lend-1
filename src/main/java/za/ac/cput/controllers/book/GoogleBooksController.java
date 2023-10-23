package za.ac.cput.controllers.book;

// GoogleBooksDeserializer.java



// GoogleBooksController.java

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class GoogleBooksController {

    private final RestTemplate restTemplate;

    public GoogleBooksController() {

        // Create ObjectMapper
        ObjectMapper mapper = new ObjectMapper();

        // Register custom deserializer
        mapper.registerModule(new SimpleModule().addDeserializer(JsonNode.class, new GoogleBooksDeserializer()));

        // Create message converter using custom mapper
        MappingJackson2HttpMessageConverter converter =
                new MappingJackson2HttpMessageConverter(mapper);

        // Setup RestTemplate
        restTemplate = new RestTemplate();
        restTemplate.setMessageConverters(List.of(converter));

    }

    @GetMapping("/covers/{isbn}")
    public ResponseEntity<String> getBook(@RequestParam String isbn) {

        String url = "https://www.googleapis.com/books/v1/volumes?q=isbn:"+isbn;

        // Call API using customized RestTemplate
        ResponseEntity<JsonNode> result = restTemplate.getForEntity(url, JsonNode.class);

        // ... process result

        return ResponseEntity.ok("...");
    }

}