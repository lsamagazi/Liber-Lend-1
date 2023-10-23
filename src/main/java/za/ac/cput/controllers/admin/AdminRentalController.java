package za.ac.cput.controllers.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.impl.Rental;
import za.ac.cput.service.impl.RentalServiceImpl;


import java.util.ArrayList;

@RestController
@RequestMapping("/api/admin/rentals")
public class AdminRentalController {
    @Autowired
    private RentalServiceImpl rentalService; // Adjust the service interface accordingly

    @GetMapping("/list/all")
    public ArrayList<Rental> getAllRentals() {
        ArrayList<Rental> rentals = new ArrayList<>(rentalService.getAll()); // Adjust the service method accordingly
        return rentals;
    }

    @PostMapping("/create")
    public Rental createRental(@RequestBody Rental rental) {
        System.out.println("/api/admin/rentals/create was triggered");
        System.out.println("RentalService was created...attempting to create book rental...");
        // Perform any necessary logic for creating a book rental

        return rentalService.create(rental);
    }

    @GetMapping("/read/{rentalId}")
    public Rental readRental(@PathVariable Integer rentalId) {
        System.out.println("/api/admin/rentals/read was triggered");
        System.out.println("RentalService was created...attempting to read book rental...");
        Rental readRental = rentalService.read(rentalId); // Adjust the service method accordingly
        return readRental;
    }

    @PutMapping("/update/{rentalId}")
    public Rental updateRental(@PathVariable int rentalId, @RequestBody Rental rental) {
        System.out.println("/api/admin/rentals/update was triggered");

        // Perform any necessary logic for updating a book rental

        Rental updated = rentalService.update(rental); // Adjust the service method accordingly
        System.out.println("updated rental: " + updated);

        return updated;
    }

    @DeleteMapping("/delete/{rentalId}")
    public boolean deleteRental(@PathVariable Integer rentalId) {
        System.out.println("/api/admin/rentals/delete was triggered");
        System.out.println("RentalService was created...attempting to delete book rental...");
        return rentalService.delete(rentalId); // Adjust the service method accordingly
    }
}
