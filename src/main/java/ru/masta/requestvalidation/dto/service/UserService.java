package ru.masta.requestvalidation.dto.service;

import org.springframework.stereotype.Service;
import ru.masta.requestvalidation.dto.UserRequest;
import ru.masta.requestvalidation.entity.User;
import ru.masta.requestvalidation.exception.UserNotFoundException;
import ru.masta.requestvalidation.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    private UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User saveUser(UserRequest userRequest){

        User user = User
                .build(0, userRequest.getName(), userRequest.getEmail(),
                        userRequest.getNumber(), userRequest.getGender(),
                        userRequest.getAge(), userRequest.getNationality());

        return repository.save(user);
    }

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(int id) throws UserNotFoundException{
        User user = repository.findByUserId(id);

        if(user!=null){
            return user;
        }else{
            throw new UserNotFoundException("user not found with id: " + id);
        }

    }
}
