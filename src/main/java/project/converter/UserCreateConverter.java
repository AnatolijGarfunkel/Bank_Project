package project.converter;

import org.springframework.stereotype.Component;
import project.dto.UserCreateDto;
import project.dto.UserResponseDto;
import project.entity.User;

@Component
public class UserCreateConverter implements Converter<User, project.dto.UserCreateDto, UserResponseDto> {

    @Override
    public UserResponseDto toDto(User user) {
        UserResponseDto userResponseDto = new UserResponseDto(user.getId(), user.getLogin(), user.getEmail());
        return userResponseDto;
    }

    @Override
    public User toEntity(UserCreateDto userCreateDto) {
        User user = new User(userCreateDto.getLogin(), userCreateDto.getEmail());
        return user;
    }
}
