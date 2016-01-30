package com.bionix.pack1;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.lang.reflect.Constructor;

/**
 * Created by bionix on 30.01.2016.
 */

public class ConstructorConfusion {
    private String someValue;

    public ConstructorConfusion(String someValue) {
        System.out.println("ConstructorConfusion(String) called");
        this.someValue = someValue;
    }

    public ConstructorConfusion(int someValue) {
        System.out.println("ConstructorConfusion(int) called");
        this.someValue = "Number: " + Integer.toString(someValue);
    }

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("META-INF/spring/app-context-conf.xml");
        ctx.refresh();
        ConstructorConfusion  cc = (ConstructorConfusion) ctx.getBean("constructorConfusion");

        System.out.println(cc);
    }

    @Override
    public String toString() {
        return someValue;
    }
}
