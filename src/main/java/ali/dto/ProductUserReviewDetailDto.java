package ali.dto;

import java.math.BigDecimal;
import java.util.Date;

public class ProductUserReviewDetailDto {
    String userName;
    String review;
    Date reviewDate;

    public ProductUserReviewDetailDto(String userName, String review, Date reviewDate){
        this.userName = userName;
        this.review = review;
        this.reviewDate = reviewDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public Date getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
    }

    @Override
    public String toString() {
        return "ProductUserReviewDetailDto{" +
                ", userEmail='" + userName + '\'' +
                ", review='" + review + '\'' +
                ", reviewDate=" + reviewDate +
                '}';
    }
}
