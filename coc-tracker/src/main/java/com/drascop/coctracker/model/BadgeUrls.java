package com.drascop.coctracker.model;

public class BadgeUrls {

    private String small;
    private String large;
    private String medium;


    /**
     * Default constructor.
     */
    public BadgeUrls() {
    }


    /**
     * Constructor with all fields.
     *
     * @param small the URL for the small badge
     * @param large the URL for the large badge
     * @param medium the URL for the medium badge
     */
    public BadgeUrls(String small, String large, String medium) {
        this.small = small;
        this.large = large;
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


    public String getLarge() {
        return large;
    }


    public void setLarge(String large) {
        if (large == null || large.isEmpty()) {
            throw new IllegalArgumentException("Large URL cannot be null or empty");
        }
        this.large = large;
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