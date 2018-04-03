package com.tutorialspoint;

/**
 * Created by Diana on 4/3/2018.
 */
public class ExampleBean {
    private String message;

    public void init() {
        message = "This is an initialization message";
    }

    public void getMessage() {
        System.out.println(this.message);
    }
}
