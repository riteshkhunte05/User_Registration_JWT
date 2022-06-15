package com.bridgelabz.user_registration_jwt.service;

import com.bridgelabz.user_registration_jwt.dto.UserLoginDTO;
import com.bridgelabz.user_registration_jwt.dto.UserRegistrationDTO;
import com.bridgelabz.user_registration_jwt.model.UserData;
import com.bridgelabz.user_registration_jwt.repository.IUserRepository;
import com.bridgelabz.user_registration_jwt.utility.TokenUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.List;


/***********************************************************************************************************************
 * Class : User Service Implementation Class.
 * @author : Ritesh
 **********************************************************************************************************************/

@Slf4j
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private TokenUtil tokenUtil;

    /**
     * Method :- Method for User Login.
     */
    @Override
    public String loginUser(UserLoginDTO userLoginDTO) {
        UserData userData = null;
        userData = new UserData(userLoginDTO);
        String token = tokenUtil.createToken(userData.getUserId());
        log.info("LoginUser Service Method Successfully executed");
        String message = "Logged in Successfully!! Your token is : " + token;
        return message;

    }

    /**
     * Method :- Method for User Registration.
     */
    @Override
    public UserData registerUser(UserRegistrationDTO userDTO) {

        String encodedPassword = bCryptPasswordEncoder.encode(userDTO.getPassword());
        userDTO.setPassword(encodedPassword);
        log.info("registerUser Service Method Successfully executed");
        UserData userData = null;
        userData = new UserData(userDTO);
        userRepository.save(userData);
        return userData;
    }

    /**
     * Method :- Method to Get All User Records.
     */
    @Override
    public List<UserData> getUserInfo() {
        log.info("getUserInfo Service Method Successfully executed");
        return userRepository.findAll();
    }

}