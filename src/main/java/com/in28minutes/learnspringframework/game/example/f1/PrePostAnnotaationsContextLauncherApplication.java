package com.in28minutes.learnspringframework.game.example.f1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SomeClass {

    private SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency) {
        super();
        this.someDependency = someDependency;
        System.out.println("all dependencies are ready");
    }

    @PostConstruct
    public void initialization() {
        someDependency.getReady();
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("Clean up");
    }

}

@Component
class SomeDependency {

    public void getReady() {
        System.out.println("Some logic using SomeDependency");
    }
}


// I need to add some things some I can push lol
// This is another test to try creating branches and merging to the main.
// testing to see how to switch between branches without committing.
//
@Configuration
@ComponentScan
// @ComponentScan("com.in28minutes.learnspringframework.game.example.a1")
public class PrePostAnnotaationsContextLauncherApplication {

    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext
                (PrePostAnnotaationsContextLauncherApplication.class)) {
                Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }

}
