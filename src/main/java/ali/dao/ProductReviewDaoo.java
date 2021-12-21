package ali.dao;

import ali.dto.ProductUserReviewDetailDto;
import ali.entity.ProductReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductReviewDaoo extends JpaRepository<ProductReview, Long> {
    @Query(value = "select ProductReview from Users inner join PRODUCT_REVIEW on Users.id = PRODUCT_REVIEW.id_users where Users.username = :username", nativeQuery = true)
    public List<ProductReview> findProductReviewByUserName(String username);

    @Query(value = "select ProductReview from Product inner join PRODUCT_REVIEW on Product.id = PRODUCT_REVIEW.id_product_review where Product.id = :id", nativeQuery = true)
    public List<ProductReview> findAllProductReview(Long id);
}
