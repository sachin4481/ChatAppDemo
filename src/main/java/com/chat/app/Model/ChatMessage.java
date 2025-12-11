package com.chat.app.Model;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ChatMessage {

    private Long id;
    private String sender;
    private String content;

    //feature branch is added

    /*
    this is the new feature2 branch
    */
}
