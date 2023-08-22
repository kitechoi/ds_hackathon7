package domain;

import java.time.LocalDateTime;

public class Review {
    private int reviewID;
    private User user;
    private MenuItem menuItem;
    private double reviewRating;
    private String reviewContent;
    private LocalDateTime reviewCreationDateTime;
    private LocalDateTime reviewEditedDateTime;
    private int reviewStatus;

    // 생성자(Constructor)
    public Review(int reviewID, User user, MenuItem menuItem, double reviewRating,
                  String reviewContent, LocalDateTime reviewCreationDateTime,
                  LocalDateTime reviewEditedDateTime, int reviewStatus) {
        this.reviewID = reviewID;
        this.user = user;
        this.menuItem = menuItem;
        this.reviewRating = reviewRating;
        this.reviewContent = reviewContent;
        this.reviewCreationDateTime = reviewCreationDateTime;
        this.reviewEditedDateTime = reviewEditedDateTime;
        this.reviewStatus = reviewStatus;
    }

    // Getter 메소드
    public int getReviewID() {
        return reviewID;
    }

    public User getUser() {
        return user;
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }

    public double getReviewRating() {
        return reviewRating;
    }

    public String getReviewContent() {
        return reviewContent;
    }

    public LocalDateTime getReviewCreationDateTime() {
        return reviewCreationDateTime;
    }

    public LocalDateTime getReviewEditedDateTime() {
        return reviewEditedDateTime;
    }

    public int getReviewStatus() {
        return reviewStatus;
    }

    // Setter 메소드
    public void setReviewID(int reviewID) {
        this.reviewID = reviewID;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setMenuItem(MenuItem menuItem) {
        this.menuItem = menuItem;
    }

    public void setReviewRating(double reviewRating) {
        this.reviewRating = reviewRating;
    }

    public void setReviewContent(String reviewContent) {
        this.reviewContent = reviewContent;
    }

    public void setReviewCreationDateTime(LocalDateTime reviewCreationDateTime) {
        this.reviewCreationDateTime = reviewCreationDateTime;
    }

    public void setReviewEditedDateTime(LocalDateTime reviewEditedDateTime) {
        this.reviewEditedDateTime = reviewEditedDateTime;
    }

    public void setReviewStatus(int reviewStatus) {
        this.reviewStatus = reviewStatus;
    }
}

