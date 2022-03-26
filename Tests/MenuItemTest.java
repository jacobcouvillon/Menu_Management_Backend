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
}
