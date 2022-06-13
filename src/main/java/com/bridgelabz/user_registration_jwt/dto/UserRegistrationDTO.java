package com.bridgelabz.user_registration_jwt.dto;

import lombok.Data;

@Data
    public class UserRegistrationDTO {
        public String firstName;
        public String lastName;
        public String emailId;
        public String password;


    public UserRegistrationDTO(String firstName, String lastName, String emailId, String password) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.emailId = emailId;
            this.password = password;
        }

        @Override
        public String toString() {
            return "UserRegistrationDTO{" + "firstName='" + firstName + '\'' + ", lastName=" + lastName + '}';
        }
    }

