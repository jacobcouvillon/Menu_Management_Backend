import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> menu;

    /**
     * constructor for the Menu object
     * @param menu list of MenuItems that represents the menu
     */
    public Menu(ArrayList<MenuItem> menu) {
        if (menu == null) {
            throw new IllegalArgumentException("The passed in menu was equal to null");
        }
        this.menu = menu;
    }

    /**
     * default constructor. Creates an empty list
     */
    public Menu() {
        ArrayList<MenuItem> menu = new ArrayList<MenuItem>();
        this.menu = menu;
    }

    /**
     * Adds a menuItem to the end of the menu ArrayList
     * @param menuItem the MenuItem to be added to the list
     * @return the menuItem added to the list
     */
    public MenuItem addMenuItem(MenuItem menuItem) {
        if (menuItem == null) {
            throw new IllegalArgumentException("The passed in Menu Item was equal to null");
        }
        this.menu.add(menuItem);
        return menuItem;
    }

    /**
     * Removes the passed in MenuItem from the menu ArrayList
     * @param menuItem the MenuItem to be removed from the list
     * @return the MenuItem removed from the list
     */
    public MenuItem removeMenuItem(MenuItem menuItem) {
        this.menu.remove(menuItem);
        return menuItem;
    }

    /**
     * Removes the MenuItem at index passed in as the parameter
     * @param index the index in the menu ArrayList of the MenuItem to be removed
     * @return the MenuItem the was removed from the list
     */
    public MenuItem removeMenuItem(int index) {
        return this.menu.remove(index);
    }

    /**
     * clears the menu so that the menu ArrayList is empty
     */
    public void clearMenu() {
        ArrayList<MenuItem> menu = new ArrayList<MenuItem>();
        this.menu = menu;
    }

    /**
     * Returns the MenuItem at the index passed in
     * @param index the index in the menu ArrayList to be returned
     * @return the MenuItem at the parameter index
     */
    public MenuItem getMenuItem(int index) {
        return this.menu.get(index);
    }

    /**
     * Returns an ArrayList of all of the MenuItems in the menu
     * @return
     */
    public ArrayList<MenuItem> getMenu() {
        return menu;
    }

    /**
     * Returns a boolean of whether the menu ArrayList contains the passed in MenuItem
     * @param menuItem the MenuItem being checked if in menu ArrayList
     * @return a boolean if the menu contains the passed in MenuItem
     */
    public boolean containsMenuItem(MenuItem menuItem) {
        for (int x = 0; x < this.menu.size(); x++) {
            if (this.menu.get(x) == menuItem) {
                return true;
            }
        }
        return false;
    }

    /**
     * Sets the menu to a new ArrayList of MenuItems
     * @param menu An ArrayList of the MenuItems that the menu attribute will equal
     */
    public void setMenu(ArrayList<MenuItem> menu) {
        if (menu == null) {
            throw new IllegalArgumentException("The passed in MenuItem list is equal to null");
        }
        this.menu = menu;
    }
}
