package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.PackManGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


// I need to add some things some I can push lol
// This is another test to try creating branches and merging to the main.
// testing to see how to switch between branches without committing.
//
@Configuration
@ComponentScan("com.in28minutes.learnspringframework.game")
public class GamingAppLauncherApplication {
    @Bean
    public GameRunner gameRunner(PackManGame game) {
        System.out.println("This is what needs to print out " + game);
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }

    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext
                (GamingAppLauncherApplication.class);) {
            context.getBean(PackManGame.class).up();
            context.getBean(GameRunner.class).run();
        }
    }

}
