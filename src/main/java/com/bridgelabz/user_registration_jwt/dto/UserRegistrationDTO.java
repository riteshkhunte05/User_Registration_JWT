package com.bridgelabz.user_registration_jwt.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
    public class UserRegistrationDTO {
        public String firstName;
        public String lastName;
        public String emailId;
        public String password;

    }

