package org.example;
import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
public class User {
    private int id;
    private String name;
    private String lastName;
    private String password;
}
