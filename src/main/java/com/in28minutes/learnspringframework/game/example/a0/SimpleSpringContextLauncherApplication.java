package com.in28minutes.learnspringframework.game.example.a0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


// I need to add some things some I can push lol
// This is another test to try creating branches and merging to the main.
// testing to see how to switch between branches without committing.

@Configuration
@ComponentScan

public class SimpleSpringContextLauncherApplication {

    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext
                (SimpleSpringContextLauncherApplication.class)) {
                Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        }
    }
}
