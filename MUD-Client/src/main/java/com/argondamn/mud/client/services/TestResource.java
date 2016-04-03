package com.argondamn.mud.client.services;

import org.springframework.stereotype.Component;

/**
 *
 * @author tim
 */
@Component
public class TestResource {
    
    public String getThingToSay() {
        return "Here I come to save the day";
    }
}
