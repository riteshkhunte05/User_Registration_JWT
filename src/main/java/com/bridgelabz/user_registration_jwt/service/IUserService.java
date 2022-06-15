package com.bridgelabz.user_registration_jwt.service;

import com.bridgelabz.user_registration_jwt.dto.UserLoginDTO;
import com.bridgelabz.user_registration_jwt.dto.UserRegistrationDTO;
import com.bridgelabz.user_registration_jwt.model.UserData;

import java.util.List;

public interface IUserService {

    String loginUser(UserLoginDTO userLoginDTO);

    List<UserData> getUserInfo();

    UserData registerUser(UserRegistrationDTO userDTO);
}
