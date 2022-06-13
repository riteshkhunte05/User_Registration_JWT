/**
 * ResponseDTO.java
 */
package com.bridgelabz.user_registration_jwt.dto;

import lombok.Getter;
import lombok.Setter;

    @Getter
    @Setter
    public class ResponseDTO {
        private String message;
        private Object data;

        public ResponseDTO(String message, Object data) {
            this.message = message;
            this.data = data;
        }
    }

