package com.bionix.pack1.annotation;

import com.bionix.pack1.MessageProvider;
import org.springframework.stereotype.Service;

/**
 * Created by bionix on 29.01.2016.
 */


@Service("messageProvider")
public class HelloWordMessageProvider implements MessageProvider {
    public String getMessage() {
        return "Hellooo!!! aaaa!!!";
    }
}
