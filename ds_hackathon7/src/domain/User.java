package domain;

public class User {
    private int userID;
    private String userName;
    private String passwordHash;
    private int studentNumber;
    private int level;

    // 생성자(Constructor)
    public User(int userID, String userName, String passwordHash, int studentNumber, int level) {
        this.userID = userID;
        this.userName = userName;
        this.passwordHash = passwordHash;
        this.studentNumber = studentNumber;
        this.level = level;
    }

    // Getter 메소드
    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public int getLevel() {
        return level;
    }

    // Setter 메소드
    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
