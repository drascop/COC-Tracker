package com.drascop.coctracker.model;

public class League {

    private JsonLocalizedName name;
    private int id;
    private IconUrls iconUrls;


    /**
     * Default constructor.
     */
    public League() {
    }


    /**
     * Constructor with all fields.
     *
     * @param name the localized name of the league
     * @param id the id of the league
     * @param iconUrls the icon URLs of the league
     */
    public League(JsonLocalizedName name, int id, IconUrls iconUrls) {
        this.name = name;
        this.id = id;
        this.iconUrls = iconUrls;
    }


    /**
     * Getters and Setters
     */

    public JsonLocalizedName getName() {
        return name;
    }


    public void setName(JsonLocalizedName name) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        this.name = name;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public IconUrls getIconUrls() {
        return iconUrls;
    }

    
    public void setIconUrls(IconUrls iconUrls) {
        if (iconUrls == null) {
            throw new IllegalArgumentException("IconUrls cannot be null");
        }
        this.iconUrls = iconUrls;
    }
}