package com.bionix.pack2;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by askandar on 31.01.16.
 */
public class InjectSimpleSpel {
    private String name;
    private String age;
    private String height;
    private String programmer;
    private String ageInSeconds;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getHeight() {
        return height;
    }

    public void setProgrammer(String programmer) {
        this.programmer = programmer;
    }

    public String getProgrammer() {
        return programmer;
    }

    public void setAgeInSeconds(String ageInSeconds) {
        this.ageInSeconds = ageInSeconds;
    }

    public String getAgeInSeconds() {
        return ageInSeconds;
    }
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
        ctx.load("META-INF/spring/app-context-xml-spel1.xml");
        ctx.refresh();

        InjectSimpleSpel simple = (InjectSimpleSpel) ctx.getBean("injectSimpleSpel");
        System.out.println(simple);
    }
}
