package com.project.controller;

import com.project.dto.UsersDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
public class UsersController1 {

    @Autowired
    private UsersDto usersDto;    

	@Autowired
    private UsersService usersService;
    
	@RequestMapping(method = RequestMethod.POST)
    public void createUsers(UsersDto userDto) {
        // TODO: Implement method
    }
    
	@RequestMapping(method = RequestMethod.PUT)
    public void updateUser(UUID userId, UsersDto userDto) {
        // TODO: Implement method
    }
    
	@RequestMapping(method = RequestMethod.DELETE)
    public void deleteUser(UUID userId) {
        // TODO: Implement method
    }
    
	@RequestMapping(method = RequestMethod.GET)
    public List getAllUsers() {
        // TODO: Implement method
    }
    
	@RequestMapping(method = RequestMethod.GET)
    public UsersDto getUserByUsername(String username) {
        // TODO: Implement method
    }
}