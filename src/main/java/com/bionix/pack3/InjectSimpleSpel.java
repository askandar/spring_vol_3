package com.bionix.pack3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

/**
 * Created by askandar on 31.01.16.
 */
@Service("injectSimpleSpel")
public class InjectSimpleSpel {

    @Value("#{injectSimpleConfigAn.name}")
    private String  name ;

    @Value("#{injectSimpleConfigAn.age+1}")
    private int age ;

    @Value("#{injectSimpleConfigAn.height}")
    private float height ;

    @Value("#{injectSimpleConfigAn.programmer}")
    private boolean programmer ;

    @Value("#{injectSimpleConfigAn.ageInSeconds}")
    private Long ageInSeconds ;

    @Override
    public String toString() {
        return "Name: " + name  + "\n"
                + "Age: " + age + "\n"
                + "Height: " + height + "\n"
                + "Programmer: " + programmer + "\n"
                + "Age In Seconds: " + ageInSeconds + "\n";
    }


    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("META-INF/spring/app-context-xml-spel1-anot.xml");
        ctx.refresh();

        InjectSimpleSpel simple = (InjectSimpleSpel) ctx.getBean("injectSimpleSpel");
        System.out.println(simple);
    }
}
