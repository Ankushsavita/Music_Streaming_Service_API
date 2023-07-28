package com.geekster.musicstreamingserviceapp.service;


import com.geekster.musicstreamingserviceapp.model.User;
import com.geekster.musicstreamingserviceapp.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    IUserRepo userRepo;

    public String addUser(User user) {
         userRepo.save(user);
         return "user add successfully";
    }

    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    public Optional<User> getUserById(Long userId) {
        return userRepo.findById(userId);
    }

    public String updateUserById(Long userId, User user) {
        Optional<User> myUserOpt = userRepo.findById(userId);
        User myUser = null;
        if(myUserOpt.isPresent()){
            myUser = myUserOpt.get();
        }else{
            return "id not found";
        }

        myUser.setUserId(user.getUserId());
        myUser.setUsername(user.getUsername());
        myUser.setUserEmail(user.getUserEmail());
        myUser.setPassword(user.getPassword());
        myUser.setPhoneNumber(user.getPhoneNumber());
        userRepo.save(myUser);

        return "user updated successfully...";
    }

    public String deleteUserById(Long userId) {
        userRepo.deleteById(userId);
        return "user deleted successfully...";
    }
}
