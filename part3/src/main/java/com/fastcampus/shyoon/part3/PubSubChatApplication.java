package com.fastcampus.shyoon.part3;

import com.fastcampus.shyoon.part3.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PubSubChatApplication implements CommandLineRunner {

    @Autowired
    private ChatService chatService;

    public static void main(String[] args) {
        SpringApplication.run(PubSubChatApplication.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println("Application started..");

        chatService.enterChatRoom("Test Chat Room");
    }
}
