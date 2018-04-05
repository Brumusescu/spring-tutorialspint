package com.tutorialspoint;

import org.springframework.beans.factory.DisposableBean;

public class ExampleDisposableBean implements DisposableBean {
    private String message;

    public void getMessage(){
        System.out.println("Your Message : " + message);
    }

    @Override
    public void destroy() throws Exception {
        message = "Dispose bean method";
        System.out.println(message);
    }
}
