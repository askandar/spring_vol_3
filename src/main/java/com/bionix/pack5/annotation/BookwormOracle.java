package com.bionix.pack5.annotation;

import org.springframework.stereotype.Service;

/**
 * Created by askandar on 31.01.16.
 */
@Service("oracle")
public class BookwormOracle implements Oracle {
    public String defineMeaningOfLife() {
        return "Bla-bla-bla";
    }
}
