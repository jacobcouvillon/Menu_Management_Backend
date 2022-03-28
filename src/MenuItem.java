public class MenuItem implements MenuItemNames{
    private double price;
    private String name;
    private String description;
    private String url;

    /**
     * MenuItem constructor
     * @param price the price of the MenuItem
     * @param name the name of the MenuItem
     * @param description a description of what the MenuItem is such as major ingredients
     * @param url a url to the image of the MenuItem
     */
    public MenuItem(double price, String name, String description, String url) {
        if (price < 0) {
            throw new IllegalArgumentException("The passed in price is less than 0");
        }
        if (name == null) {
            throw new IllegalArgumentException("The passed in name is equal to null");
        }
        if (description == null) {
            throw new IllegalArgumentException("The passed in description is equal to null");
        }
        if (url == null) {
            throw new IllegalArgumentException("The passed in url is equal to null");
        }
        this.price = price;
        if (nameSet.add(name)) {
            this.name = name;
        }
        this.description = description;
        this.url = url;
    }

    /**
     * default constructor
     */
    public MenuItem() {
        this(0, "", "", "");
    }


    /**
     * returns a double of the price attribute
     * @return the price of the MenuItem (int)
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * returns a String of the name attribute
     * @return the name of the MenuItem (String)
     */
    public String getName() {
        return this.name;
    }

    /**
     * returns a String of the description attribute
     * @return a description of the MenuItem (String)
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * returns a String of the url attribute
     * @return a url to the image of the MenuItem (String)
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * sets the price attribute
     * @param price the value the price is being set to
     */
    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("The passed in price is less than 0");
        }
        this.price = price;
    }

    /**
     * sets the name attribute to the argument in the method
     * @param name the String the name attribute is being set to
     */
    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("The passed in name is equal to null");
        }
        if (nameSet.add(name)) {
            this.name = name;
        }
    }

    /**
     * sets the description attribute to the argument in the method
     * @param description the String the description attribute is being to set
     */
    public void setDescription(String description) {
        if (description == null) {
            throw new IllegalArgumentException("The passed in description is equal to null");
        }
        this.description = description;
    }

    /**
     * sets the url attribute to the argument in the method
     * @param url the String the url attribute is being set to
     */
    public void setUrl(String url) {
        if (url == null) {
            throw new IllegalArgumentException("The passed in url is equal to null");
        }
        this.url = url;
    }
}
