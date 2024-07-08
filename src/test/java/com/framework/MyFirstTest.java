package com.framework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.annotation.processing.SupportedAnnotationTypes;

public class MyFirstTest {
    //Unit test
    @Test
    void myFirstTest() {
        int result = sum(4,5);
        Assertions.assertEquals(10,result);
    }

    int sum(int x,int y){
        return x+y;
    }
}
