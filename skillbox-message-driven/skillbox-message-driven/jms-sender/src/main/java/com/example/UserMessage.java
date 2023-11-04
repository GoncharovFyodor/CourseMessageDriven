package com.example;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Класс, представляющий сообщение пользователя.
 *
 * @author teo07
 */

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserMessage {
  private String message;

  private String username;

  private LocalDateTime timestamp = LocalDateTime.now();

}
