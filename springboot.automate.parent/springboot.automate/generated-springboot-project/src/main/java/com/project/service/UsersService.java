package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod.*;

@Service
public class UsersService {

    

    public void createUsers(UsersDto userDto) {
        // TODO: Implement method
    }
    

    public void updateUser(UUID userId, UsersDto userDto) {
        // TODO: Implement method
    }
    

    public void deleteUser(UUID userId) {
        // TODO: Implement method
    }
    

    public List getAllUsers() {
        // TODO: Implement method
    }
    

    public UsersDto getUserByUsername(String username) {
        // TODO: Implement method
    }
}