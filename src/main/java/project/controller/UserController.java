package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.converter.Converter;
import project.dto.UserCreateDto;
import project.dto.UserResponseDto;
import project.entity.User;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private Converter<User, UserCreateDto, UserResponseDto> converter;
}
