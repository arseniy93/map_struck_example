package org.example;

import lombok.Getter;
import lombok.Setter;

/**
 * Hello world!
 */
@Getter
@Setter
public class App {
    private  UserMapper userMapper;
    public static void main(String[] args) {
        User user = User.builder()
                .name("Andrey")
                .lastName("Losko")
                .id(1)
                .password("12Tdswqw*")
                .build();

        System.out.println("user");
        System.out.println(user.toString());

        UserDto userDto = UserMapper.INSTANCE.userToUserDto(user);

        System.out.println("UserDto");
        System.out.println(userDto);

    }
}
