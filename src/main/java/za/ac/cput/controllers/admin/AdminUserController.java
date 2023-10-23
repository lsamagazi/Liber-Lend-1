package za.ac.cput.controllers.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.impl.User;
import za.ac.cput.service.impl.UserServiceImpl;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/admin/users")
public class AdminUserController {
    @Autowired
    private UserServiceImpl userService;

    @GetMapping ("/list/all")
    public ArrayList<User> getAll() {
        ArrayList<User> users = new ArrayList<>(userService.getAll());
        return users;
    }
    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        User createdUser = userService.create(user);
        return createdUser;
    }

    @GetMapping("/read/{userId}")
    public User readUser(@PathVariable Integer userId) {
        User readUser = userService.read(userId);
        return readUser;
    }

    @PutMapping("/update/{userId}")
    public User updateUser(@PathVariable int userId, @RequestBody User updatedUser) {
        User updated = userService.update(updatedUser);
        return updated;
    }

    @DeleteMapping("/delete/{userId}")
    public boolean deleteUser(@PathVariable Integer userId) {
        System.out.println("/api/admin/users/delete was triggered");
        System.out.println("UserService was created...attempting to delete user...");
        return userService.delete(userId);
    }


}
