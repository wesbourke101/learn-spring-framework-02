package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.PackManGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.in28minutes.learnspringframework.game")
public class App02GamingSpringBeans {

    @Bean
    public GameRunner gameRunner(PackManGame game) {
        System.out.println("This is what needs to print out " + game);
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }


    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext
                (App02GamingSpringBeans.class);) {
            context.getBean(PackManGame.class).up();
            context.getBean(GameRunner.class).run();
        }
    }

}
