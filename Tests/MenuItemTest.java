import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class MenuItemTest {
    @Test
    public void createMenuItemTest() {
        String description = "A small pizza with a choice of any three toppings";
        MenuItem item = new MenuItem(10.99, "Small Pizza", description, "", Course.ENTREE, "", Type.STANDALONE);
        Assertions.assertEquals(10.99, item.getPrice());
        Assertions.assertEquals("Small Pizza", item.getName());
        Assertions.assertEquals(description, item.getDescription());
    }

    @Test
    public void setMenuItemPriceTest() {
        String description = "A small pizza with a choice of any three toppings";
        MenuItem item = new MenuItem(10.99, "Small Pizza", description, "", Course.ENTREE, "", Type.STANDALONE);
        item.setPrice(9.99);
        Assertions.assertEquals(9.99, item.getPrice());
    }

    @Test
    public void setMenuItemNameTest() {
        String description = "A small pizza with a choice of any three toppings";
        MenuItem item = new MenuItem(10.99, "Small Pizza", description, "", Course.ENTREE, "", Type.STANDALONE);
        String newName = "Large Pizza";
        item.setName(newName);
        Assertions.assertEquals(newName, item.getName());
    }

    @Test
    public void setMenuItemDescriptionTest() {
        String description = "A small pizza with a choice of any three toppings";
        MenuItem item = new MenuItem(10.99, "Small Pizza", description, "", Course.ENTREE, "", Type.STANDALONE);
        String newDescription = "A large pizza with a choice of any three toppings";
        item.setDescription(newDescription);
        Assertions.assertEquals(newDescription, item.getDescription());
    }

    @Test
    public void setMenuItemUrlTest() {
        String description = "A small pizza with a choice of any three toppings";
        MenuItem item = new MenuItem(10.99, "Small Pizza", description, "", Course.ENTREE, "", Type.STANDALONE);
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
        MenuItem item1 = new MenuItem(10.99, "Medium Pizza", description, "www.fakeurl.com", Course.ENTREE, "", Type.STANDALONE);
        MenuItem item2 = new MenuItem(10.99, "Medium Pizza", description, "www.fakeurl.com", Course.ENTREE, "", Type.STANDALONE);
        Assertions.assertEquals("Medium Pizza", item1.getName());
        // Tests that the second MenuItem will not have the same name as the first
        Assertions.assertNotEquals("Medium Pizza", item2.getName());
    }

    /*
    * Level 3 Test
    * Tests that a salad can be ordered as a standalone or side dish
     */
    @Test
    public void SaladTypeTest() {
        String description = "A standalone salad with any choice of dressing";
        MenuItem salad1 = new MenuItem(3.99, "Standalone salad", description, "www.fakeurl.com", Course.ENTREE, "Italian", Type.STANDALONE);
        String description2 = "A side salad with any choice of dressing";
        MenuItem salad2 = new MenuItem(3.99, "Side salad", description2, "www.fakeurl.com", Course.ENTREE, "Ranch", Type.SIDE);
        Assertions.assertEquals(Type.STANDALONE, salad1.getType());
        Assertions.assertEquals(Type.SIDE, salad2.getType());
    }

    /*
    * Level 3 Test
    * Tests that an entree or appetizer salad can be ordered with any choice of dressing
     */
    @Test
    public void dressingTest() {
        String description = "A standalone salad with any choice of dressing";
        MenuItem salad1 = new MenuItem(3.99, "Standalone salad", description, "www.fakeurl.com", Course.ENTREE, "Italian", Type.STANDALONE);
        String description2 = "A side salad with any choice of dressing";
        MenuItem salad2 = new MenuItem(3.99, "Side salad", description2, "www.fakeurl.com", Course.APPETIZER, "Ranch", Type.SIDE);
        Assertions.assertEquals("Italian", salad1.getDressing());
        Assertions.assertEquals("Ranch", salad2.getDressing());
    }

    /*
    * Level 3 Test
    * Tests that a MenuItem can be ordered as an entree, appetizer, or dessert
     */
    @Test
    public void MenuItemCourseTest() {
        String description = "A standalone salad with any choice of dressing";
        MenuItem salad1 = new MenuItem(3.99, "Standalone salad", description, "www.fakeurl.com", Course.ENTREE, "Italian", Type.STANDALONE);
        String description2 = "A side salad with any choice of dressing";
        MenuItem salad2 = new MenuItem(3.99, "Side salad", description2, "www.fakeurl.com", Course.APPETIZER, "Ranch", Type.SIDE);
        String description3 = "A chocolate cake";
        MenuItem cake = new MenuItem(4.99, "Chocolate Cake", description3, "www.fakeurl.com", Course.DESSERT, "Ranch", Type.STANDALONE);
        Assertions.assertEquals(Course.ENTREE, salad1.getCourse());
        Assertions.assertEquals(Course.APPETIZER, salad2.getCourse());
        Assertions.assertEquals(Course.DESSERT, cake.getCourse());
    }

    /*
    * Level 3 Test
    * Tests that a side of dressing can only be ordered with an entree or appetizer
     */
    @Test
    public void dressingCourseTest() {
        String description = "A standalone salad with any choice of dressing";
        MenuItem salad1 = new MenuItem(3.99, "Standalone salad", description, "www.fakeurl.com", Course.ENTREE, "Italian", Type.STANDALONE);
        String description2 = "A side salad with any choice of dressing";
        MenuItem salad2 = new MenuItem(3.99, "Side salad", description2, "www.fakeurl.com", Course.APPETIZER, "Ranch", Type.SIDE);
        String description3 = "A chocolate cake";
        MenuItem cake = new MenuItem(4.99, "Chocolate Cake", description3, "www.fakeurl.com", Course.DESSERT, "Ranch", Type.STANDALONE);
        Assertions.assertEquals("Italian", salad1.getDressing());
        Assertions.assertEquals("Ranch", salad2.getDressing());
        Assertions.assertNotEquals("Ranch", cake.getDressing());
    }
}
