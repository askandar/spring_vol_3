package com.bionix.pack1.annotation;

import com.bionix.pack1.MessageProvider;
import com.bionix.pack1.MessageRenderer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by bionix on 29.01.2016.
 */

@Service("messageRenderer")
public class StandartOutMessageRenderer implements MessageRenderer {
    private MessageProvider messageProvider;

    public void render() {
        if (messageProvider == null){
            throw  new RuntimeException("You must set the property messageProvider of class:" + StandartOutMessageRenderer.class.getName());
        }
        System.out.println(messageProvider.getMessage());

    }

    @Autowired
    public void setMessageProvider(MessageProvider provider) {
        messageProvider = provider;
    }

    public MessageProvider getMessageProvider() {
        return messageProvider;
    }
}
