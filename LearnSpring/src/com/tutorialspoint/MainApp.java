package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld obj1 = (HelloWorld) context.getBean("helloWorld1");
        obj1.getMessage();

        HelloWorld obj2A = (HelloWorld) context.getBean("helloWorld2");
        obj2A.setMessage("I'm object 2 A");
        obj2A.getMessage();

        HelloWorld obj2B = (HelloWorld) context.getBean("helloWorld2");
        obj2B.setMessage("I'm object 2 B");
        obj2B.getMessage();

        HelloWorld obj3A = (HelloWorld) context.getBean("helloWorld3");
        obj3A.setMessage("I'm object 3 A");
        obj3A.getMessage();

        HelloWorld obj3B = (HelloWorld) context.getBean("helloWorld3");
        obj3B.getMessage();

        ExampleBean obj4A = (ExampleBean) context.getBean("exampleBean1");
        obj4A.getMessage();
        ExampleBean obj4B = (ExampleBean) context.getBean("exampleBean2");
        obj4B.getMessage();

        ExampleInitializingBean obj5A = (ExampleInitializingBean) context.getBean("exampleInitializingBean1");
        obj5A.getMessage();

    }
}
