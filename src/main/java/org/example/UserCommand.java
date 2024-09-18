package org.example;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserCommand {
    private int id;
    private String name;
    private String password;

}
