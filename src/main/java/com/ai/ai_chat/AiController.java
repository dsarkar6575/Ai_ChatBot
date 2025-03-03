package com.ai.ai_chat;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/chat")
public class AiController {

  @Autowired
  private final ChatService chatService;

 
  @PostMapping("/ask")
  public ResponseEntity<String> askQuestion(@RequestBody Map<String,String> payload){
    String question=payload.get("question");
    String answer=chatService.getAnswer(question);

    return ResponseEntity.ok(answer);
  }
}
