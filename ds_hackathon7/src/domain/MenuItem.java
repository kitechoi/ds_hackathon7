package domain;

public class MenuItem {
    private int menuID;
    private MenuSection menuSection;
    private String menuName;
    private String menuDescription;
    private String menuTag;
    private String menuPhotoURL;
    private double menuStarRating;
    private int menuPrice;

    // 생성자(Constructor)
    public MenuItem(int menuID, MenuSection menuSection, String menuName, String menuDescription,
                    String menuTag, String menuPhotoURL, double menuStarRating, int menuPrice) {
        this.menuID = menuID;
        this.menuSection = menuSection;
        this.menuName = menuName;
        this.menuDescription = menuDescription;
        this.menuTag = menuTag;
        this.menuPhotoURL = menuPhotoURL;
        this.menuStarRating = menuStarRating;
        this.menuPrice = menuPrice;
    }

    // Getter 메소드
    public int getMenuID() {
        return menuID;
    }

    public MenuSection getMenuSection() {
        return menuSection;
    }

    public String getMenuName() {
        return menuName;
    }

    public String getMenuDescription() {
        return menuDescription;
    }

    public String getMenuTag() {
        return menuTag;
    }

    public String getMenuPhotoURL() {
        return menuPhotoURL;
    }

    public double getMenuStarRating() {
        return menuStarRating;
    }

    public int getMenuPrice() {
        return menuPrice;
    }

    // Setter 메소드
    public void setMenuID(int menuID) {
        this.menuID = menuID;
    }

    public void setMenuSection(MenuSection menuSection) {
        this.menuSection = menuSection;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public void setMenuDescription(String menuDescription) {
        this.menuDescription = menuDescription;
    }

    public void setMenuTag(String menuTag) {
        this.menuTag = menuTag;
    }

    public void setMenuPhotoURL(String menuPhotoURL) {
        this.menuPhotoURL = menuPhotoURL;
    }

    public void setMenuStarRating(double menuStarRating) {
        this.menuStarRating = menuStarRating;
    }

    public void setMenuPrice(int menuPrice) {
        this.menuPrice = menuPrice;
    }
}
