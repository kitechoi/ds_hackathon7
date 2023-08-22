package domain;

import java.time.LocalDateTime;

public class Order {
    private int orderID;
    private User user;
    private MenuItem menuItem;
    private LocalDateTime orderDateTime;
    private int orderQuantity;
    private String orderPaymentMethod;
    private int orderPreparationStatus;
    private int orderEstimatedPreparationTime;

    // 생성자(Constructor)
    public Order(int orderID, User user, MenuItem menuItem, LocalDateTime orderDateTime,
                 int orderQuantity, String orderPaymentMethod, int orderPreparationStatus,
                 int orderEstimatedPreparationTime) {
        this.orderID = orderID;
        this.user = user;
        this.menuItem = menuItem;
        this.orderDateTime = orderDateTime;
        this.orderQuantity = orderQuantity;
        this.orderPaymentMethod = orderPaymentMethod;
        this.orderPreparationStatus = orderPreparationStatus;
        this.orderEstimatedPreparationTime = orderEstimatedPreparationTime;
    }

    // Getter 메소드
    public int getOrderID() {
        return orderID;
    }

    public User getUser() {
        return user;
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }

    public LocalDateTime getOrderDateTime() {
        return orderDateTime;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }

    public String getOrderPaymentMethod() {
        return orderPaymentMethod;
    }

    public int getOrderPreparationStatus() {
        return orderPreparationStatus;
    }

    public int getOrderEstimatedPreparationTime() {
        return orderEstimatedPreparationTime;
    }

    // Setter 메소드
    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setMenuItem(MenuItem menuItem) {
        this.menuItem = menuItem;
    }

    public void setOrderDateTime(LocalDateTime orderDateTime) {
        this.orderDateTime = orderDateTime;
    }

    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public void setOrderPaymentMethod(String orderPaymentMethod) {
        this.orderPaymentMethod = orderPaymentMethod;
    }

    public void setOrderPreparationStatus(int orderPreparationStatus) {
        this.orderPreparationStatus = orderPreparationStatus;
    }

    public void setOrderEstimatedPreparationTime(int orderEstimatedPreparationTime) {
        this.orderEstimatedPreparationTime = orderEstimatedPreparationTime;
    }
}
