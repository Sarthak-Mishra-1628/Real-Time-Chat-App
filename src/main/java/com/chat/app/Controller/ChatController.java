package com.chat.app.Controller;

import java.util.List;
import org.springframework.messaging.handler.annotation.*;
import org.springframework.stereotype.Controller;
import com.chat.app.Entity.ChatMessage;
import com.chat.app.Repository.Repository;

import org.springframework.web.bind.annotation.*;

@Controller
public class ChatController{

    private final Repository repo;

     public ChatController(Repository repository){
        repo=repository;
    }

    // /app/sendMessage
    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public ChatMessage sendMessage(ChatMessage message){
        repo.save(message);
        return message;
    }

    @GetMapping("/chat")
    public String chat(){
        return "chat";
    }
    
    // REST API to fetch past messages
    @ResponseBody
    @GetMapping("/api/messages")
    public List<ChatMessage> getAllMessages() {
        return repo.findAll();
    }

}