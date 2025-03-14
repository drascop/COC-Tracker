package com.drascop.coctracker.model;

public class IconUrls {

    private String small;
    private String tiny;
    private String medium;


    /**
     * Default constructor.
     */
    public IconUrls() {
    }


    /**
     * Constructor with all fields.
     *
     * @param small the URL for the small icon
     * @param tiny the URL for the tiny icon
     * @param medium the URL for the medium icon
     */
    public IconUrls(String small, String tiny, String medium) {
        this.small = small;
        this.tiny = tiny;
        this.medium = medium;
    }


    /**
     * Getters and Setters
     */

    public String getSmall() {
        return small;
    }


    public void setSmall(String small) {
        if (small == null || small.isEmpty()) {
            throw new IllegalArgumentException("Small URL cannot be null or empty");
        }
        this.small = small;
    }


    public String getTiny() {
        return tiny;
    }


    public void setTiny(String tiny) {
        if (tiny == null || tiny.isEmpty()) {
            throw new IllegalArgumentException("Tiny URL cannot be null or empty");
        }
        this.tiny = tiny;
    }


    public String getMedium() {
        return medium;
    }


    public void setMedium(String medium) {
        if (medium == null || medium.isEmpty()) {
            throw new IllegalArgumentException("Medium URL cannot be null or empty");
        }
        this.medium = medium;
    }
}