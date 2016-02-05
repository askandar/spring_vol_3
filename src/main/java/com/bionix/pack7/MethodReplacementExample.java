package com.bionix.pack7;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.util.StopWatch;

/**
 * Created by askandar on 05.02.16.
 */
public class MethodReplacementExample {
    public static void main(String[] args) {


        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/replace-context.xml");
        ctx.refresh();

        ReplacementTarget replacementTarget  = (ReplacementTarget) ctx.getBean("replacementTarget");
        ReplacementTarget standartTarget = (ReplacementTarget) ctx.getBean("standardTarget");

        displayInfo(replacementTarget);
        displayInfo(standartTarget);
    }


    private static void displayInfo(ReplacementTarget target){
        System.out.println(target.formatMessage("Hello World!!!"));

        StopWatch stopWatch = new StopWatch();
        stopWatch.start("perfTest");

        for (int i = 0; i < 1000000; i++) {
            String out = target.formatMessage("foo");
        }

        stopWatch.stop();

        System.out.println("1000000 invocation took: " + stopWatch.getTotalTimeMillis() + " ms");
    }
}
