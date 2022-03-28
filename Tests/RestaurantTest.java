import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class RestaurantTest {
    /*
    * Level 2 Test
    * Tests that restaurants can have multiple menus
     */
    @Test
    public void restaurantMultipleMenusTest() {
        ArrayList<Menu> menuList = new ArrayList<Menu>();
        ArrayList<MenuItem> menuItemList = new ArrayList<MenuItem>();
        String description = "A small pizza with a choice of any three toppings";
        MenuItem item = new MenuItem(10.99, "Small Pizza", description, "");
        menuItemList.add(item);  // creating menu item list for menu object
        Menu menu = new Menu(menuItemList);
        Menu menu2 = new Menu(menuItemList);
        menuList.add(menu);  // creating menu list for restaurant object
        menuList.add(menu2);
        Restaurant restaurant = new Restaurant(menuList);
        Assertions.assertEquals(menu, restaurant.getMenuList().get(0)); // checks that the restaurant object contains the first menu
        Assertions.assertEquals(menu2, restaurant.getMenuList().get(1)); // checks that the restaurant object contains the second menu
    }


    @Test
    public void createRestaurantTest() {
        ArrayList<Menu> menuList = new ArrayList<Menu>();
        ArrayList<MenuItem> menuItemList = new ArrayList<MenuItem>();
        String description = "A small pizza with a choice of any three toppings";
        MenuItem item = new MenuItem(10.99, "Small Pizza", description, "");
        menuItemList.add(item);  // creating menu item list for menu object
        Menu menu = new Menu(menuItemList);
        menuList.add(menu);  // creating menu list for restaurant object
        Restaurant restaurant = new Restaurant(menuList);
        Assertions.assertEquals(restaurant.getMenuList(), menuList);
    }

    @Test
    public void createDefaultRestaurantTest() {
        ArrayList<Menu> menuList = new ArrayList<Menu>();
        Restaurant restaurant = new Restaurant();
        Assertions.assertEquals(restaurant.getMenuList(), menuList);
    }

    @Test
    public void addMenuTest() {
        ArrayList<Menu> menuList = new ArrayList<Menu>();
        ArrayList<MenuItem> menuItemList = new ArrayList<MenuItem>();
        String description = "A small pizza with a choice of any three toppings";
        MenuItem item = new MenuItem(10.99, "Small Pizza", description, "");
        menuItemList.add(item);
        Menu menu = new Menu(menuItemList);
        Restaurant restaurant = new Restaurant();
        restaurant.addMenu(menu);
        Assertions.assertEquals(menu, restaurant.getMenuList().get(0));
    }

    @Test
    public void removeMenuTest() {
        ArrayList<Menu> menuList = new ArrayList<Menu>();
        ArrayList<Menu> blankMenu = new ArrayList<Menu>();
        ArrayList<MenuItem> menuItemList = new ArrayList<MenuItem>();
        String description = "A small pizza with a choice of any three toppings";
        MenuItem item = new MenuItem(10.99, "Small Pizza", description, "");
        menuItemList.add(item);
        Menu menu = new Menu(menuItemList);
        Restaurant restaurant = new Restaurant();
        restaurant.addMenu(menu);
        restaurant.removeMenu(menu);
        Assertions.assertEquals(blankMenu, restaurant.getMenuList());
    }

    @Test
    public void clearMenuTest() {
        ArrayList<Menu> menuList = new ArrayList<Menu>();
        ArrayList<Menu> blankMenu = new ArrayList<Menu>();
        ArrayList<MenuItem> menuItemList = new ArrayList<MenuItem>();
        String description = "A small pizza with a choice of any three toppings";
        MenuItem item = new MenuItem(10.99, "Small Pizza", description, "");
        menuItemList.add(item);
        Menu menu = new Menu(menuItemList);
        Restaurant restaurant = new Restaurant();
        restaurant.addMenu(menu);
        restaurant.clearMenuList();
        Assertions.assertEquals(blankMenu, restaurant.getMenuList());
    }

    @Test
    public void setMenuListTest() {
        ArrayList<Menu> menuList = new ArrayList<Menu>();
        ArrayList<MenuItem> menuItemList = new ArrayList<MenuItem>();
        String description = "A small pizza with a choice of any three toppings";
        MenuItem item = new MenuItem(10.99, "Small Pizza", description, "");
        menuItemList.add(item);
        Menu menu = new Menu(menuItemList);
        menuList.add(menu);
        Restaurant restaurant = new Restaurant();
        restaurant.setMenuList(menuList);
        Assertions.assertEquals(menuList, restaurant.getMenuList());
    }

    /*
    * Level 2 test
    * This tests that a Restaurant can have multiple menus with the same MenuItem
     */
    @Test
    public void menuItemOnMultipleMenusTest() {
        ArrayList<Menu> menuList = new ArrayList<Menu>();
        ArrayList<MenuItem> menuItemList1 = new ArrayList<MenuItem>();
        ArrayList<MenuItem> menuItemList2 = new ArrayList<MenuItem>();
        String description = "A small pizza with a choice of any three toppings";
        MenuItem item = new MenuItem(10.99, "Small Pizza", description, "");
        menuItemList1.add(item);
        menuItemList2.add(item);
        Menu menu1 = new Menu(menuItemList1);  // a menu with the item MenuItem
        Menu menu2 = new Menu(menuItemList2);  // a menu with the same MenuItem
        menuList.add(menu1);
        menuList.add(menu2);
        Restaurant restaurant = new Restaurant();
        restaurant.setMenuList(menuList);  // a restaurant that contains multiple menus of the same MenuItem

        // tests that the first menu contains the menuItem
        Assertions.assertEquals(item, restaurant.getMenuList().get(0).getMenuItem(0));
        // tests that the second menu contains the same menuItem
        Assertions.assertEquals(item, restaurant.getMenuList().get(1).getMenuItem(0));
    }
}
