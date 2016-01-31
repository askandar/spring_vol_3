package com.bionix.pack3;

import org.springframework.stereotype.Component;

/**
 * Created by askandar on 31.01.16.
 */
@Component("injectSimpleConfigAn")
public class InjectSimpleConfig {
    private String  name = "Askandar Kalandarov M";
    private int age = 31;
    private float height = 1.77f;
    private boolean programmer = true;
    private Long ageInSeconds = 1009843200L;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public boolean isProgrammer() {
        return programmer;
    }

    public void setProgrammer(boolean programmer) {
        this.programmer = programmer;
    }

    public Long getAgeInSeconds() {
        return ageInSeconds;
    }

    public void setAgeInSeconds(Long ageInSeconds) {
        this.ageInSeconds = ageInSeconds;
    }
}
