package com.in28minutes.learnspringframework.game.example.g1;

import jakarta.inject.Inject;
import jakarta.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class BusinessService {

    private DataThing dataThing;

    @Autowired
    public void setDataThing(DataThing dataThing) {
        System.out.println("Setter injection");
        this.dataThing = dataThing;
    }

    public DataThing getDataThing() {
        return dataThing;
    }
}

@Component
class DataThing {

}

// I need to add some things some I can push lol
// This is another test to try creating branches and merging to the main.
// testing to see how to switch between branches without committing.

@Configuration
@ComponentScan
public class CDIContextLauncherApplication {

    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext
                (CDIContextLauncherApplication.class)) {
//                Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

                System.out.println(context.getBean(BusinessService.class).getDataThing());

        }
    }
}
