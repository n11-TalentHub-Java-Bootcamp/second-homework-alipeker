package ali.controller;

import ali.dao.ProductReviewDaoo;
import ali.dto.ProductUserReviewDetailDto;
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
    private ProductReviewDaoo productReviewDaoo;

    @GetMapping("")
    public List<ProductReview> findAllReview() {
        return productReviewDaoo.findAll();
    }

    /*
        Odevdeki 3.2 nolu madde
    */
    @GetMapping("/product/{id}")
    public List<ProductReview> findProductReviewByUserName(@PathVariable("username") Long id){
        return productReviewDaoo.findAllProductReview(id);
    }

    /*
        Odevdeki 3.1 nolu madde
    */
    @GetMapping("/username/{username}")
    public List<ProductReview> findProductReviewByUserName(@PathVariable("username") String username){
        return productReviewDaoo.findProductReviewByUserName(username);
    }

    /*
        Odevdeki 3.3 nolu madde
    */
    @PostMapping("")
    public ProductReview saveReview(@RequestBody ProductReview review){
        return productReviewDaoo.save(review);
    }

    @PutMapping("")
    public ProductReview updateReview(@RequestBody ProductReview review){
        return productReviewDaoo.save(review);
    }

    /*
        Odevdeki 3.4 nolu madde
    */
    @DeleteMapping("{id}")
    public void deleteReview(@PathVariable("id") Long id) throws Exception {
        productReviewDaoo.deleteById(id);
    }
}
