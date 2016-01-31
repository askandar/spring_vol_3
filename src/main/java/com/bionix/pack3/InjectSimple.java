package com.bionix.pack3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

/**
 * Created by bionix on 30.01.2016.
 */

@Service("injectSimple")
public class InjectSimple {

    @Value("Askandar Kalandarov")
    private String  name;
    @Value("31")
    private int age;
    @Value("176.5")
    private float height;
    @Value("true")
    private boolean programmer;
    @Value("1009998877")
    private Long ageInSeconds;

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("META-INF/spring/app-simple-inject-annotation.xml");
        ctx.refresh();

        InjectSimple simple = (InjectSimple) ctx.getBean("injectSimple");
        System.out.println(simple);
    }

    @Override
    public String toString() {
        return "Name: " + name  + "\n"
                + "Age: " + age + "\n"
                + "Height: " + height + "\n"
                + "Programmer: " + programmer + "\n"
                + "Age In Seconds: " + ageInSeconds + "\n";
    }
}
