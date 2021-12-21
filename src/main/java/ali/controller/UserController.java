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

    /*
        Odevdeki 2.1 nolu madde
    */
    @GetMapping("/")
    public List<UserDto> findAllUsers() {
        return userEntityService.findAll();
    }

    /*
        Odevdeki 2.2 nolu madde
    */
    @GetMapping("/username/{username}")
    public UserDto findUserByUserName(String username){
        return userEntityService.findUserByUserName(username);
    }

    /*
        Odevdeki 2.3 nolu madde
    */
    @GetMapping("/phonenumber/{phoneNumber}")
    public UserDto findUserByPhoneNumber(String phoneNumber){
        return userEntityService.findUserByPhoneNumber(phoneNumber);
    }

    /*
        Odevdeki 2.4 nolu madde
    */
    @PostMapping("")
    public UserDto saveUser(@RequestBody UserDto user){
        return userEntityService.saveUser(user);
    }

    /*
        Odevdeki 2.6 nolu madde
    */
    @PutMapping("")
    public UserDto updateUser(@RequestBody UserDto user){
        return userEntityService.updateUser(user);
    }

    /*
        Odevdeki 2.5 nolu madde
    */
    @DeleteMapping("")
    public String deleteUser(@RequestBody UserDto user) throws Exception {
        return userEntityService.deleteUser(user);
    }

}
