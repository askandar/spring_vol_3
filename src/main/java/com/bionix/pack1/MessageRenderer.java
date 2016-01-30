package com.bionix.pack1;

/**
 * Created by bionix on 29.01.2016.
 */
public interface MessageRenderer {
    void render();
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();

}
