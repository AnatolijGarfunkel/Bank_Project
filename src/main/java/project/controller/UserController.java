package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.converter.Converter;
import project.dto.UserCreateDto;
import project.dto.UserResponseDto;
import project.entity.User;
import project.service.UserService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private Converter<User, UserCreateDto, UserResponseDto> converter;

    @Autowired
    private UserService service;


//  @GET --------------------------------------------------------------------------------------------------

    @GetMapping
    public List<UserResponseDto> getAll() {
        List<User> users = service.getAll();
        List<UserResponseDto> userResponseDtos = new ArrayList<>();
        for (User user : users) {
            userResponseDtos.add(converter.toDto(user));
        }
        return userResponseDtos;
    }
}
