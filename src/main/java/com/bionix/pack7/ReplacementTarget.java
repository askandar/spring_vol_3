package com.bionix.pack7;

/**
 * Created by askandar on 05.02.16.
 */
public class ReplacementTarget {
    public String formatMessage(String msg){
        return "<h1>" + msg + "</h1>";
    }

    public String formatMessage(Object msg){
        return "<h1>" + msg + "</h1>";
    }
}
