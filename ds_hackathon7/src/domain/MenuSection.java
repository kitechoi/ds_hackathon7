package domain;

public class MenuSection {
    private int menuSectionID;
    private String menuSectionName;

    // 생성자(Constructor)
    public MenuSection(int menuSectionID, String menuSectionName) {
        this.menuSectionID = menuSectionID;
        this.menuSectionName = menuSectionName;
    }

    // Getter 메소드
    public int getMenuSectionID() {
        return menuSectionID;
    }

    public String getMenuSectionName() {
        return menuSectionName;
    }

    // Setter 메소드
    public void setMenuSectionID(int menuSectionID) {
        this.menuSectionID = menuSectionID;
    }

    public void setMenuSectionName(String menuSectionName) {
        this.menuSectionName = menuSectionName;
    }
}
