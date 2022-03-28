import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class MenuItemTest {
    @Test
    public void createMenuItemTest() {
        String description = "A small pizza with a choice of any three toppings";
        MenuItem item = new MenuItem(10.99, "Small Pizza", description, "");
        Assertions.assertEquals(10.99, item.getPrice());
        Assertions.assertEquals("Small Pizza", item.getName());
        Assertions.assertEquals(description, item.getDescription());
    }

    @Test
    public void setMenuItemPriceTest() {
        String description = "A small pizza with a choice of any three toppings";
        MenuItem item = new MenuItem(10.99, "Small Pizza", description, "");
        item.setPrice(9.99);
        Assertions.assertEquals(9.99, item.getPrice());
    }

    @Test
    public void setMenuItemNameTest() {
        String description = "A small pizza with a choice of any three toppings";
        MenuItem item = new MenuItem(10.99, "Small Pizza", description, "");
        String newName = "Large Pizza";
        item.setName(newName);
        Assertions.assertEquals(newName, item.getName());
    }

    @Test
    public void setMenuItemDescriptionTest() {
        String description = "A small pizza with a choice of any three toppings";
        MenuItem item = new MenuItem(10.99, "Small Pizza", description, "");
        String newDescription = "A large pizza with a choice of any three toppings";
        item.setDescription(newDescription);
        Assertions.assertEquals(newDescription, item.getDescription());
    }

    @Test
    public void setMenuItemUrlTest() {
        String description = "A small pizza with a choice of any three toppings";
        MenuItem item = new MenuItem(10.99, "Small Pizza", description, "");
        String url = "www.fakeurl.com";
        item.setUrl(url);
        Assertions.assertEquals(url, item.getUrl());
    }

    @Test
    public void defaultMenuItemTest() {
        MenuItem item = new MenuItem();
        Assertions.assertEquals(0, item.getPrice());
        Assertions.assertEquals("", item.getName());
        Assertions.assertEquals("", item.getDescription());
        Assertions.assertEquals("", item.getUrl());
    }

    /*
    * Level 2 Test
    * Tests that there cannot be two MenuItem objects with the same name
     */
    @Test
    public void duplicateMenuItemNameTest() {
        String description = "A medium pizza with a choice of any three toppings";
        MenuItem item1 = new MenuItem(10.99, "Medium Pizza", description, "www.fakeurl.com");
        MenuItem item2 = new MenuItem(10.99, "Medium Pizza", description, "www.fakeurl.com");
        Assertions.assertEquals("Medium Pizza", item1.getName());
        // Tests that the second MenuItem will not have the same name as the first
        Assertions.assertNotEquals("Medium Pizza", item2.getName());
    }
}
