package com.server.service;


import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class PortListener {
    private int port;

    @EventListener
    public void onApplicationEvent(WebServerInitializedEvent event) {
        this.port = event.getWebServer().getPort();
        System.out.println("############################### Running on port is : " + port +" ###############################");
    }

    public int getPort() {
        return port;
    }
}

