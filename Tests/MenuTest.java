import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class MenuTest {
    @Test
    public void createMenuTest() {
        ArrayList menuList = new ArrayList();
        String description = "A small pizza with a choice of any three toppings";
        MenuItem item = new MenuItem(10.99, "Small Pizza", description, "");
        menuList.add(item);
        Menu menu = new Menu(menuList);
        Assertions.assertEquals(item, menu.getMenu().get(0));
        Assertions.assertEquals(10.99, menu.getMenu().get(0).getPrice());
    }

    @Test
    public void defaultMenuTest() {
        Menu menu = new Menu();
        ArrayList<MenuItem> list = new ArrayList<MenuItem>();
        Assertions.assertEquals(menu.getMenu(), list);
    }

    @Test
    public void addMenuItemTest() {
        Menu menu = new Menu();
        String description = "A small pizza with a choice of any three toppings";
        MenuItem item = new MenuItem(10.99, "Small Pizza", description, "");
        menu.addMenuItem(item);
        Assertions.assertEquals(item, menu.getMenu().get(0));
    }

    @Test
    public void removeMenuItemTest() {
        ArrayList<MenuItem> menuList = new ArrayList<MenuItem>();
        String description = "A small pizza with a choice of any three toppings";
        MenuItem item = new MenuItem(10.99, "Small Pizza", description, "");
        menuList.add(item);
        Menu menu = new Menu(menuList);
        menu.removeMenuItem(item);
        ArrayList<MenuItem> list = new ArrayList<MenuItem>();
        Assertions.assertEquals(menu.getMenu(), list);
    }

    @Test
    public void removeMenuItemIndexTest() {
        ArrayList<MenuItem> menuList = new ArrayList<MenuItem>();
        String description = "A small pizza with a choice of any three toppings";
        MenuItem item = new MenuItem(10.99, "Small Pizza", description, "");
        menuList.add(item);
        Menu menu = new Menu(menuList);
        menu.removeMenuItem(0);
        ArrayList<MenuItem> list = new ArrayList<MenuItem>();
        Assertions.assertEquals(menu.getMenu(), list);
    }

    @Test
    public void clearMenuTest() {
        ArrayList<MenuItem> menuList = new ArrayList<MenuItem>();
        String description = "A small pizza with a choice of any three toppings";
        MenuItem item = new MenuItem(10.99, "Small Pizza", description, "");
        menuList.add(item);
        Menu menu = new Menu(menuList);
        menu.clearMenu();
        ArrayList<MenuItem> list = new ArrayList<MenuItem>();
        Assertions.assertEquals(menu.getMenu(), list);
    }

    @Test
    public void getMenuItemTest() {
        ArrayList<MenuItem> menuList = new ArrayList<MenuItem>();
        String description = "A small pizza with a choice of any three toppings";
        MenuItem item = new MenuItem(10.99, "Small Pizza", description, "");
        menuList.add(item);
        Menu menu = new Menu(menuList);
        Assertions.assertEquals(item, menu.getMenuItem(0));
    }

    @Test
    public void containsMenuItemTest() {
        ArrayList<MenuItem> menuList = new ArrayList<MenuItem>();
        String description = "A small pizza with a choice of any three toppings";
        MenuItem item = new MenuItem(10.99, "Small Pizza", description, "");
        menuList.add(item);
        Menu menu = new Menu(menuList);
        Assertions.assertEquals(true, menu.containsMenuItem(item));
    }

    @Test
    public void setMenuTest() {
        Menu menu = new Menu();
        ArrayList<MenuItem> menuList = new ArrayList<MenuItem>();
        String description = "A small pizza with a choice of any three toppings";
        MenuItem item = new MenuItem(10.99, "Small Pizza", description, "");
        menuList.add(item);
        menu.setMenu(menuList);
        Assertions.assertEquals(menuList, menu.getMenu());
    }
}
