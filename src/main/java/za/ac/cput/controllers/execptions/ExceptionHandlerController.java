package za.ac.cput.controllers.execptions;
/*
*
* */
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import za.ac.cput.exception.BookNotAvailableException;
import za.ac.cput.exception.UserCantRentMoreThanOneBookException;

@RestControllerAdvice
public class ExceptionHandlerController {

    @ExceptionHandler(BookNotAvailableException.class)
    public ResponseEntity<String> handleCarNotAvailableException(BookNotAvailableException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }

    @ExceptionHandler(UserCantRentMoreThanOneBookException.class)
    public ResponseEntity<String> handleUserCantRentMoreThanOneCarException(UserCantRentMoreThanOneBookException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }
}