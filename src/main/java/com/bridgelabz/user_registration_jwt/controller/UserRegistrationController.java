package com.bridgelabz.user_registration_jwt.controller;

import com.bridgelabz.user_registration_jwt.dto.ResponseDTO;
import com.bridgelabz.user_registration_jwt.dto.UserRegistrationDTO;
import com.bridgelabz.user_registration_jwt.model.UserData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

    @RequestMapping("/userregistration")
    @RestController
    public class UserRegistrationController {


        @RequestMapping(value = {"", "/", "getUserInfo"})
        public ResponseEntity<ResponseDTO> getUserInfo() {
            UserData userData = null;
            userData = new UserData(1,new UserRegistrationDTO("Rahul","Singh","singhrahul@gmail.com","Pass@123"));
            ResponseDTO responseDTO = new ResponseDTO("Get call for UserInfo is successful ",userData);
            return new ResponseEntity<>(responseDTO, HttpStatus.OK);
        }

    }

