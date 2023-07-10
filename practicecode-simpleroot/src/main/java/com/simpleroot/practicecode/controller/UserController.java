package com.simpleroot.practicecode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.simpleroot.practicecode.dto.UserDTO;
import com.simpleroot.practicecode.service.UserService;

import java.util.List;

@RestController
@RequestMapping(value="api/v1/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUsers")
    public List<UserDTO> getUser(){
        return userService.getAllUsers();
    }
    
    @PostMapping("/saveUser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO){

        return userService.saveUser(userDTO);
    }

    @PutMapping("/updateUser")
    public UserDTO updateUser(@RequestBody UserDTO userDTO){
        return userService.updateUser(userDTO);
    }

    @DeleteMapping("/deleteUser")
    public boolean deleteUser(@RequestBody UserDTO userDTO){
        return userService.deleteUser(userDTO);
    }

    @GetMapping("/getUserByUserId/{userID}")
    public  UserDTO getUserByUserID(@PathVariable String userID){
        return userService.getUserByUserID(userID);
    }
    @GetMapping("/getUserByUserIdAndAddress/{userID}/{address}")
    public  UserDTO getUserByUserIDAndAddress(@PathVariable String userID, @PathVariable String address){
        return userService.getUserByUserIDAndAddress(userID,address);
    }
}
