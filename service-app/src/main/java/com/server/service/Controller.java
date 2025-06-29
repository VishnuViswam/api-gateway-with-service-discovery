package com.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private String buildName;
    @Autowired
    private PortListener portListener;



    @GetMapping(value="getStatus",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> createUser() {
        System.out.println("<--- Service to save new user request : received --->");
        System.out.println("<--- Service to save new user response : given --->");
        return ResponseEntity.status(HttpStatus.CREATED).body("Success from : "+portListener.getPort());

    }
}
