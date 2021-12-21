package ali.controller;

import ali.dao.ProductReviewDaoo;
import ali.dto.UserDto;
import ali.entity.ProductReview;
import ali.entityService.UserEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/review")
public class ReviewController {
    @Autowired
    private UserEntityService userEntityService;

    @Autowired
    private ProductReviewDaoo productReviewDaoo;

    @GetMapping("")
    public List<UserDto> findAllUsers() {
        return userEntityService.findAll();
    }

    @GetMapping("/username/{username}")
    public UserDto findUserByUserName(String username){
        return userEntityService.findUserByUserName(username);
    }

    @GetMapping("/user/{username}")
    public List<ProductReview> findProductReviewByUserName(String username){
        return productReviewDaoo.findProductReviewByUserName(username);
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
