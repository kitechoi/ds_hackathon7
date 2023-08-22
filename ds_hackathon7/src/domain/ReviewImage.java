package domain;

public class ReviewImage {
    private int reviewImageID;
    private MenuItem menuItem;
    private Review review;
    private String reviewImageURL;

    // 생성자(Constructor)
    public ReviewImage(int reviewImageID, MenuItem menuItem, Review review, String reviewImageURL) {
        this.reviewImageID = reviewImageID;
        this.menuItem = menuItem;
        this.review = review;
        this.reviewImageURL = reviewImageURL;
    }

    // Getter 메소드
    public int getReviewImageID() {
        return reviewImageID;
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }

    public Review getReview() {
        return review;
    }

    public String getReviewImageURL() {
        return reviewImageURL;
    }

    // Setter 메소드
    public void setReviewImageID(int reviewImageID) {
        this.reviewImageID = reviewImageID;
    }

    public void setMenuItem(MenuItem menuItem) {
        this.menuItem = menuItem;
    }

    public void setReview(Review review) {
        this.review = review;
    }

    public void setReviewImageURL(String reviewImageURL) {
        this.reviewImageURL = reviewImageURL;
    }
}
