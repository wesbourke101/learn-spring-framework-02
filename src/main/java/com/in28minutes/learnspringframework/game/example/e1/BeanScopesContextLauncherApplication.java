package com.in28minutes.learnspringframework.game.example.e1;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class NormalClass {

}
@Scope(value=ConfigurableListableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass {

}

// I need to add some things some I can push lol
// This is another test to try creating branches and merging to the main.
// testing to see how to switch between branches without committing.


@Configuration
@ComponentScan
public class BeanScopesContextLauncherApplication {

    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext
                (BeanScopesContextLauncherApplication.class)) {
                Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);


                System.out.println(context.getBean(NormalClass.class));
                System.out.println(context.getBean(NormalClass.class));

                System.out.println(context.getBean(PrototypeClass.class));
                System.out.println(context.getBean(PrototypeClass.class));
                System.out.println(context.getBean(PrototypeClass.class));
        }
    }

}
