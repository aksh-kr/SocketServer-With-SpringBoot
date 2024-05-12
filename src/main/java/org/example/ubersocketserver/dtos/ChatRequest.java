package org.example.ubersocketserver.dtos;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ChatRequest {
    private String message;
    public String name;
}
