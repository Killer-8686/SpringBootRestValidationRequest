package ru.masta.requestvalidation.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.masta.requestvalidation.dto.UserRequest;
import ru.masta.requestvalidation.entity.User;
import ru.masta.requestvalidation.service.UserService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping ("/add_user")
    public ResponseEntity<User> saveUser(@RequestBody @Valid UserRequest userRequest){
        return new ResponseEntity(service.saveUser(userRequest), HttpStatus.CREATED);
    }

    @GetMapping("/all-users")
    public ResponseEntity<List<User>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getById(@PathVariable int id){
        return ResponseEntity.ok(service.findById(id));
    }

}
