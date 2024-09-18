package org.example;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper( UserMapper.class );

    UserDto userToUserDto (User user);//map User to UserDto
    User userDtoToUser (UserDto userDto);//map UserDto to User


    User userCommandToUser(UserCommand userCommand);//map UserCommand to User
    UserCommand userToUserCommand(User user);//map User to UserCommand

    UserDto userCommandToUserDto (UserCommand userCommand);//map UserCommand to UserDto
    UserCommand userDtoToUserComman (UserDto userDto);//map userDto to UserCommand





}
