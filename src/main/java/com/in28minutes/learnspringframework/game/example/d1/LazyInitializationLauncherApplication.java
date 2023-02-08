package com.in28minutes.learnspringframework.game.example.d1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class ClassA {

}

@Component
@Lazy
class ClassB {

    private ClassA classA;

    public ClassB(ClassA classA) {
        System.out.println("some logic");
        this.classA = classA;
    }

    public void doSomeThing() {
        System.out.println("My method just did something.");
    }

}

// I need to add some things some I can push lol
// This is another test to try creating branches and merging to the main.
// testing to see how to switch between branches without committing.
//
@Configuration
@ComponentScan
// @ComponentScan("com.in28minutes.learnspringframework.game.example.a1")
public class LazyInitializationLauncherApplication {

    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext
                (LazyInitializationLauncherApplication.class)) {

            System.out.println("Initialization of context completed");

            context.getBean(ClassB.class).doSomeThing();
        }

        System.out.println("Trying to get merge to a branch from the master");

    }

}
