package com.ai.ai_chat;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class ChatService {

  //access to api-key and url[gemini]
  @Value("${gemini.api.url}")
  private String geminiApiUrl;

  @Value("${gemini.api.key}")
  private String geminiApiKey;

  private final WebClient webClient;

  public ChatService(WebClient.Builder webClient){
    this.webClient=webClient.build();
  }

  public String getAnswer(String question) {
    //Construct the request payload
    Map<String, Object>requestBody=Map.of(
      "contents", new Object[]{
        Map.of("parts",new Object[]{
          Map.of("text",question)
        })
      }
    );
    //Make api call 
    String response=webClient.post()
    .uri(geminiApiUrl+geminiApiKey)
    .header("Content-Type","application/json")
    .bodyValue(requestBody)
    .retrieve()
    .bodyToMono(String.class)
    .block();

    //Return response
    return response;
  }

}
