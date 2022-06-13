package com.bridgelabz.user_registration_jwt.model;

import com.bridgelabz.user_registration_jwt.dto.UserRegistrationDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
    public class UserData {
        private int userId;
        private String firstName;
        private String lastName;
        private String emailId;
        private String password;

        public UserData(int userId, UserRegistrationDTO UserRegistrationDTO) {
            this.userId = userId;
            this.firstName = UserRegistrationDTO.firstName;
            this.lastName = UserRegistrationDTO.lastName;
            this.emailId = UserRegistrationDTO.emailId;
            this.password = UserRegistrationDTO.password;
        }
    }

