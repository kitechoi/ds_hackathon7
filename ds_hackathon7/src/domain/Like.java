package domain;

public class Like {
    private int likeID;
    private int likeValue;
    private Review review;

    // 생성자(Constructor)
    public Like(int likeID, int likeValue, Review review) {
        this.likeID = likeID;
        this.likeValue = likeValue;
        this.review = review;
    }

    // Getter 메소드
    public int getLikeID() {
        return likeID;
    }

    public int getLikeValue() {
        return likeValue;
    }

    public Review getReview() {
        return review;
    }

    // Setter 메소드
    public void setLikeID(int likeID) {
        this.likeID = likeID;
    }

    public void setLikeValue(int likeValue) {
        this.likeValue = likeValue;
    }

    public void setReview(Review review) {
        this.review = review;
    }
}
