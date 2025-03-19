package com.drascop.coctracker.model;

public class JsonLocalizedName {

    private String en; // English


    /**
     * Default constructor.
     */
    public JsonLocalizedName() {
    }


    /**
     * Constructor with all fields.
     *
     * @param en the name in English
     */
    public JsonLocalizedName(String en) {
        this.en = en;
    }


    /**
     * Getters and setters below
     */

    public String getEn() {
        return en;
    }
    

    public void setEn(String en) {
        if (en == null || en.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.en = en;
    }
}