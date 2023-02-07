package com.in28minutes.learnspringframework.game.example.c1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


// I need to add some things some I can push lol
// This is another test to try creating branches and merging to the main.
// testing to see how to switch between branches without committing.
//
@Configuration
@ComponentScan
// @ComponentScan("com.in28minutes.learnspringframework.game.example.a1")
public class RealWorldSpringContextLauncherApplication {

    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext
                (RealWorldSpringContextLauncherApplication.class)) {

                Arrays.stream(context.getBeanDefinitionNames())
                        .forEach(System.out::println);

        }
    }
}
