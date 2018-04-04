package com.tutorialspoint;

import org.springframework.beans.factory.InitializingBean;

/**
 * Created by Diana on 4/3/2018.
 */
public class ExampleInitializingBean implements InitializingBean {
    private String message;

    public void afterPropertiesSet() throws Exception {
        message = "This is an initialization message with afterPropertiesSet() method";
    }

    public void getMessage() {
        System.out.println(this.message);
    }
}
