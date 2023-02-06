package com.in28minutes.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class PackManGame implements GamingConsole{
    public void up(){
        System.out.println("Float up");
    }
    public void down() {
        System.out.println("Float Down");
    }
    public void left() {
        System.out.println("Float left");
    }
    public void right() {
        System.out.println("Float right");
    }
}
