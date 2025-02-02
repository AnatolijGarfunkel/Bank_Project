package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.converter.Converter;
import project.dto.UserCreateDto;
import project.dto.UserResponseDto;
import project.entity.User;
import project.service.UserService;
import jakarta.validation.Valid;
import java.util.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private Converter<User, UserCreateDto, UserResponseDto> converter;

    @Autowired
    private UserService service;


//  @GET ---------------------------------------------------------------------------------------------------------------

    @GetMapping
    public List<UserResponseDto> getAll() {
        List<User> users = service.getAll();
        List<UserResponseDto> userResponseDtos = new ArrayList<>();
        for (User user : users) {
            userResponseDtos.add(converter.toDto(user));
        }
        return userResponseDtos;
    }

    @GetMapping("/{id}")
    public UserResponseDto getById(@PathVariable long id) {
        User user = service.getById(id);
        UserResponseDto userResponseDto = converter.toDto(user);
        return userResponseDto;
    }

//  @POST --------------------------------------------------------------------------------------------------------------

    @PostMapping
    public UserResponseDto create(@RequestBody @Valid UserCreateDto userCreateDto) {
        User entity = converter.toEntity(userCreateDto);
        User user = service.create(entity);
        UserResponseDto userResponseDto = converter.toDto(user);
        return userResponseDto;
    }

//  @DELETE ------------------------------------------------------------------------------------------------------------

    @DeleteMapping("/{id}")
    public UserResponseDto remove(@PathVariable long id) {
        User removed = service.remove(id);
        UserResponseDto userResponseDto = converter.toDto(removed);
        return userResponseDto;
    }

// EXCEPTION -----------------------------------------------------------------------------------------------------------

//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    @ExceptionHandler(ConstraintViolationException.class)
//    public Map<String, String> handleValidationException(ConstraintViolationException exception) {
//        Map<String, String> errorMap = new HashMap<>();
//        Set<ConstraintViolation<?>> constraintViolations = exception.getConstraintViolations();
//        for (ConstraintViolation violation : constraintViolations) {
//            String message = violation.getMessage();
//            String param = violation.getPropertyPath().toString();
//            errorMap.put(param, message);
//        }
//        return errorMap;
//    }

}









































