package com.example.MedcareApp.Controller;


import com.example.MedcareApp.Entity.user;
import com.example.MedcareApp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<?> createUser(@RequestBody user newUser) {

       var createdrecord= ResponseEntity.ok(userService.createUser(newUser));
        Map<String, Object> response = new HashMap<>();
        response.put("success", true);
        response.put("message", "Sign up successful!");
        return ResponseEntity.ok(response);

    }


    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody user userRequest) {
        user existingUser = userService.getUserByEmail(userRequest.getEmailId());

        if (existingUser != null && existingUser.getPassword().equals(userRequest.getPassword())) {
            Map<String, Object> response = new HashMap<>();
            response.put("success", true);
            response.put("message", "Login successful");
            response.put("user", Map.of(
                    "username", existingUser.getUserId(),
                    "emailId", existingUser.getEmailId()
            ));
            return ResponseEntity.ok(response);
        }

        return ResponseEntity
                .status(HttpStatus.UNAUTHORIZED)
                .body(Map.of("unsuccessfull", false, "message", "Invalid credentials"));
    }

    @GetMapping
    public ResponseEntity<List<user>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<user> getUserById(@PathVariable String id) {
        return userService.getUserById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<user> updateUser(@PathVariable String id, @RequestBody user updatedUser) {
        user result = userService.updateUser(id, updatedUser);
        if (result != null) {
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable String id) {
        if (userService.deleteUser(id)) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
