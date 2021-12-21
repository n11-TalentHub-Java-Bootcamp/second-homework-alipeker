package ali.dao;

import ali.entity.ProductReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductReviewDaoo extends JpaRepository<ProductReview, Long> {
    @Query(value = "select * from User user left join PRODUCT_REVIEW productReview on user.id = productReview.userId.id where user.username = :username", nativeQuery = true)
    public List<ProductReview> findProductReviewByUserName(String username);
}
