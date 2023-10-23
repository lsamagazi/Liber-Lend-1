package za.ac.cput.controllers.book;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

import static java.util.logging.Level.parse;

// Create a custom deserializer
class GoogleBooksDeserializer extends JsonDeserializer<JsonNode> {

    @Override
    public JsonNode deserialize(JsonParser parser, DeserializationContext context) throws IOException {
        // Manually parse and build JsonNode
        JsonNode root = parser.readValueAsTree();

        return root;

    }

}
