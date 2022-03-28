public class MenuItem implements MenuItemNames{
    private double price;
    private String name;
    private String description;
    private String url;
    private Type type; // level 3
    private Course course; // level 3
    private String dressing; // level 3

    /**
     * MenuItem constructor
     * @param price the price of the MenuItem
     * @param name the name of the MenuItem
     * @param description a description of what the MenuItem is such as major ingredients
     * @param url a url to the image of the MenuItem
     */
    public MenuItem(double price, String name, String description, String url, Course course, String dressing, Type type) {
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
        if (type == null) {
            throw new IllegalArgumentException("The passed in type is equal to null");
        }
        if (dressing == null) {
            throw new IllegalArgumentException("The passed in dressing is equal to null");
        }
        if (course == null) {
            throw new IllegalArgumentException("The passed in course is equal to null");
        }
        this.price = price;
        if (nameSet.add(name)) {
            this.name = name;
        }
        this.description = description;
        this.url = url;
        this.type = type;
        this.course = course;
        if (course == Course.ENTREE || course == Course.APPETIZER) {
            this.dressing = dressing;
        }
    }

    /**
     * default constructor
     */
    public MenuItem() {
        this(0, "", "", "", Course.ENTREE, "", Type.STANDALONE);
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
     * return the type of the MenuItem as a Type enum
     * @return a Type enum that represents the type of MenuItem
     */
    public Type getType() { return this.type; }

    /**
     * returns a String of the dressing with the order
     * @return a string that hold the name of the dressing
     */
    public String getDressing() { return this.dressing; }

    /**
     * returns the course of the MenuItem as a Course enum
     * @return a Course enum that represents the course of the MenuItem
     */
    public Course getCourse() { return this.course; }

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

    /**
     * sets the type of the MenuItem equal to the parameter
     * @param type the desired type of MenuItem from the Type enum
     */
    public void setType(Type type) {
        this.type = type;
    }

    /**
     * sets the course of the MenuItem equal to the parameter
     * @param course the desired course of the MenuItem from the Course enum
     */
    public void setCourse(Course course) {
        this.course = course;
    }

    /**
     * sets the dressing equal to the parameter if the MenuItem is an appetizer or entree
     * @param dressing
     */
    public void setDressing(String dressing) {
        if (this.course == Course.APPETIZER || this.course == Course.ENTREE) {
            this.dressing = dressing;
        }
    }
}
