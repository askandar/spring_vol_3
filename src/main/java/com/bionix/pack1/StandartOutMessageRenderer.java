package com.bionix.pack1;

/**
 * Created by bionix on 29.01.2016.
 */
public class StandartOutMessageRenderer implements MessageRenderer {

    private MessageProvider messageProvider;
    public void render() {
        if (messageProvider == null){
            throw  new RuntimeException("You must set the property messageProvider of class:" + StandartOutMessageRenderer.class.getName());
        }
        System.out.println(messageProvider.getMessage());
    }

    public void setMessageProvider(MessageProvider provider) {
        messageProvider = provider;
    }

    public MessageProvider getMessageProvider() {
        return messageProvider;
    }
}
