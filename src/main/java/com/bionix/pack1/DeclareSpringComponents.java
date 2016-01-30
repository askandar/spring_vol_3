package com.bionix.pack1;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by bionix on 29.01.2016.
 */
public class DeclareSpringComponents {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("META-INF/spring/app-context-annotation-con.xml");
        ctx.refresh();
        MessageProvider messageProvider = ctx.getBean("messageProvider",MessageProvider.class);
        System.out.println(messageProvider.getMessage());
/*        MessageRenderer messageRenderer = ctx.getBean("messageRenderer",MessageRenderer.class);
        messageRenderer.render();*/
    }
}
