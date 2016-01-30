package com.bionix.pack2;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by bionix on 30.01.2016.
 */
public class InjectSimple {
    private String  name;
    private int age;
    private float height;
    private boolean programmer;
    private Long ageInSeconds;

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("META-INF/spring/app-simple-inject.xml");
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

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setProgrammer(boolean programmer) {
        this.programmer = programmer;
    }

    public void setAgeInSeconds(Long ageInSeconds) {
        this.ageInSeconds = ageInSeconds;
    }
}
