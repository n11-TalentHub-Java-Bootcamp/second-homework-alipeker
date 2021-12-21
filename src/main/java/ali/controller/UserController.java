package ali.controller;

import ali.dto.UserDto;
import ali.entityService.UserEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserEntityService userEntityService;

    @GetMapping("/")
    public List<UserDto> findAllUsers() {
        return userEntityService.findAll();
    }

    @GetMapping("/username/{username}")
    public UserDto findUserByUserName(String username){
        return userEntityService.findUserByUserName(username);
    }

    @GetMapping("/phonenumber/{phoneNumber}")
    public UserDto findUserByPhoneNumber(String phoneNumber){
        return userEntityService.findUserByPhoneNumber(phoneNumber);
    }

    @PostMapping("")
    public UserDto saveUser(@RequestBody UserDto user){
        return userEntityService.saveUser(user);
    }

    @PutMapping("")
    public UserDto updateUser(@RequestBody UserDto user){
        return userEntityService.updateUser(user);
    }

    @DeleteMapping("")
    public String deleteUser(@RequestBody UserDto user) throws Exception {
        return userEntityService.deleteUser(user);
    }

}
