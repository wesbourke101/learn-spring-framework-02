package com.in28minutes.learnspringframework.game.example.a1;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.PackManGame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//YourbusinessClass
@Component
class YourBusinessClass {

    Dependency1 dependency1;

    Dependency2 dependency2;

    //@Autowired
    public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        super();
        System.out.println("WESWESWESWESWESWESWESWESWESWESWESWESWES");
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

//    @Autowired
//    public void setDependency1(Dependency1 dependency1) {
//        this.dependency1 = dependency1;
//    }
//
//    @Autowired
//    public void setDependency2(Dependency2 dependency2) {
//        this.dependency2 = dependency2;
//    }
    @Autowired
    public Dependency1 getDependency1() {
        return dependency1;
    }

    @Autowired
    public Dependency2 getDependency2() {
        return dependency2;
    }

    @Autowired
    public String toString() {
        return "Using " + dependency1 + " and " + dependency2;
    }
}
//Dependency1
@Component
class Dependency1 {

}
//Dependency2
@Component
class Dependency2 {

}
// I need to add some things some I can push lol
// This is another test to try creating branches and merging to the main.
// testing to see how to switch between branches without committing.
//
@Configuration
@ComponentScan
// @ComponentScan("com.in28minutes.learnspringframework.game.example.a1")
public class DepInjectionLauncherApplication {

    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext
                (DepInjectionLauncherApplication.class);) {
                Arrays.stream(context.getBeanDefinitionNames())
                        .forEach(System.out::println);

                System.out.println(context.getBean(YourBusinessClass.class));

        }
    }

}
