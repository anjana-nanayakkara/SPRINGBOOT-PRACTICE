package com.simpleroot.practicecode.service;

import com.simpleroot.practicecode.entity.User;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.simpleroot.practicecode.dto.UserDTO;
import com.simpleroot.practicecode.repo.UserRepo;
import jakarta.transaction.Transactional;

import java.util.List;


@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;

    public UserDTO saveUser(UserDTO userDTO){

        userRepo.save(modelMapper.map(userDTO, User.class));
        return userDTO;
    }

    public List<UserDTO> getAllUsers(){

        List<User>userList=userRepo.findAll();
        return modelMapper.map(userList,new TypeToken<List<UserDTO>>(){}.getType());
    }

    public UserDTO updateUser(UserDTO userDTO){

        userRepo.save(modelMapper.map(userDTO, User.class));
        return userDTO;
    }

    public boolean deleteUser(UserDTO userDTO){

        userRepo.delete(modelMapper.map(userDTO, User.class));
        return true;
    }

    public UserDTO getUserByUserID(String userID){
        User user = userRepo.getUserByUserID(userID);
        return  modelMapper.map(user,UserDTO.class);
    }

    public UserDTO getUserByUserIDAndAddress(String userID,String address){
        User user = userRepo.getUserByUserIDAndAddress(userID,address);
        return  modelMapper.map(user,UserDTO.class);
    }

}
