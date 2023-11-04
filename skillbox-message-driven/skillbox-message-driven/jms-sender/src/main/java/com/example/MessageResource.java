package com.example;

import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * MessageResource.
 *
 * @author teo07
 */

@RestController
public class MessageResource {

  @Autowired
  private JmsTemplate jmsTemplate;

  @PostMapping("/send/queue")
  public String sendToQueue(@RequestBody UserMessage userMessage){
    userMessage.setTimestamp(LocalDateTime.now());
    jmsTemplate.convertAndSend("queue", userMessage);
    return "Message sent to queue";
  }

}
