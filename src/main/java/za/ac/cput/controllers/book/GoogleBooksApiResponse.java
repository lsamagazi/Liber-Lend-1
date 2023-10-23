package za.ac.cput.controllers.book;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess;

import java.util.List;

public class GoogleBooksApiResponse {
    private List<AbstractReadWriteAccess.Item> items;

    public List<AbstractReadWriteAccess.Item> getItems() {
        return items;
    }

    public void setItems(List<AbstractReadWriteAccess.Item> items) {
        this.items = items;
    }

    // Add other fields as needed to match the JSON structure
}
