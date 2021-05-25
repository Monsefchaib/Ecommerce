package com.ecommercespring.ecommercespring.Services;


import com.ecommercespring.ecommercespring.Repositories.UserRepo;
import com.ecommercespring.ecommercespring.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public void addUser(User user){

        userRepo.save(user);
    }

    public List<User> getAllUsers(){
        return userRepo.findAll();
    }

}
