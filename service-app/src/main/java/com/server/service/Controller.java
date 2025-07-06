package com.server.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class Controller {

    private static final Logger logger = LoggerFactory.getLogger(Controller.class);
    private final PortListener portListener;

    public Controller(PortListener portListener) {
        this.portListener = portListener;
    }


    @GetMapping(value = "getStatus", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<ResponseEntity<Object>> healthCheck() {
        logger.info("<--- Service to get status request : received --->");
        logger.info("<--- Service to get status response : given --->");
        return Mono.just(ResponseEntity.ok("Success from : " + portListener.getPort()));
    }
}
