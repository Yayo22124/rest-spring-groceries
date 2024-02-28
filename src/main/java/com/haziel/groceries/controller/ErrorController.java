package com.haziel.groceries.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ErrorController {

    @GetMapping("/error")
    public ResponseEntity<String> handleNotFound() {
        ErrorDetails errorDetails = new ErrorDetails("Not Found", "Por favor utiliza un endpoint valido cómo /miscelanea/products/");
        Gson gson = new Gson();
        String jsonError = gson.toJson(errorDetails);

        return new ResponseEntity<>(jsonError, HttpStatus.NOT_FOUND);
    }
    
    private static class ErrorDetails {
        private final String error;
        private final String message;
    
        public ErrorDetails(String error, String message) {
            this.error = error;
            this.message = message;
        }
    
        public String getError() {
            return error;
        }
        public String getMessage() {
            return message;
        }
    }
}
