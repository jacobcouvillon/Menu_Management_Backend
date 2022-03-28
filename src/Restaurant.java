import java.util.ArrayList;

public class Restaurant {
    private ArrayList<Menu> menuList;

    /**
     * Constructor for Restaurant object
     * @param menuList an ArrayList of Menu Objects
     */
    public Restaurant(ArrayList<Menu> menuList) {
        if (menuList == null) {
            throw new IllegalArgumentException("The passed in Menu list is equal to null");
        }
        this.menuList = menuList;
    }

    /**
     * default constructor
     */
    public Restaurant() {
        ArrayList<Menu> menuList = new ArrayList<Menu>();
        this.menuList = menuList;
    }

    /**
     * Adds a Menu object to the Menu list
     * @param menu the menu object being added
     */
    public void addMenu(Menu menu) {
        if (menu == null) {
            throw new IllegalArgumentException("The passed in menu is equal to null");
        }
        this.menuList.add(menu);
    }

    /**
     * Removes a Menu object from the Menu list
     * @param menu the menu object being removed
     */
    public void removeMenu(Menu menu) {
        this.menuList.remove(menu);
    }

    /**
     * clears the Menu list so that it equals an empty list
     */
    public void clearMenuList() {
        ArrayList<Menu> menuList = new ArrayList<Menu>();
        this.menuList = menuList;
    }

    /**
     * Gets the list of menus the restaurant has
     * @return the ArrayList of Menu objects
     */
    public ArrayList<Menu> getMenuList() {
        return this.menuList;
    }

    /**
     * Sets the menu list to equal the menu list passed into the function
     * @param menuList the ArrayList of Menu objects that the menuList will now equal
     */
    public void setMenuList(ArrayList<Menu> menuList) {
        if (menuList == null) {
            throw new IllegalArgumentException("The passed in list of Menu objects is equal to null");
        }
        this.menuList = menuList;
    }
}
