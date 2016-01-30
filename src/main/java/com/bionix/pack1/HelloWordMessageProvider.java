package com.bionix.pack1;

import org.springframework.stereotype.Service;

/**
 * Created by bionix on 29.01.2016.
 */


public class HelloWordMessageProvider implements MessageProvider {

    public String getMessage() {
        return "Helllooo!!!";
    }
}
