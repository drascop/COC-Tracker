package com.drascop.coctracker.model;

public class PlayerClan {
    private String tag;
    private int clanLevel;
    private String name;
    private BadgeUrls badgeUrls;


    /**
     * Default constructor.
     */
    public PlayerClan() {
    }


    /**
     * Constructor with all fields.
     *
     * @param tag the tag of the clan
     * @param clanLevel the level of the clan
     * @param name the name of the clan
     * @param badgeUrls the badge URLs of the clan
     */
    public PlayerClan(String tag, int clanLevel, String name, BadgeUrls badgeUrls) {
        this.tag = tag;
        this.clanLevel = clanLevel;
        this.name = name;
        this.badgeUrls = badgeUrls;
    }


    /**
     * Copy constructor 
     * 
     * @param copy The PlayerClan object being copied
     */
    public PlayerClan(PlayerClan copy) {
        this.tag = copy.tag;
        this.clanLevel = copy.clanLevel;
        this.name = copy.name;
        this.badgeUrls = copy.badgeUrls;
    }


    /**
     * Getters and Setters
     */

    public String getTag() {
        return tag;
    }


    public void setTag(String tag) {
        if (tag == null || tag.isEmpty()) {
            throw new IllegalArgumentException("Tag cannot be null or empty");
        }
        this.tag = tag;
    }


    public int getClanLevel() {
        return clanLevel;
    }


    public void setClanLevel(int clanLevel) {
        this.clanLevel = clanLevel;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }


    public BadgeUrls getBadgeUrls() {
        return badgeUrls;
    }

    
    public void setBadgeUrls(BadgeUrls badgeUrls) {
        if (badgeUrls == null) {
            throw new IllegalArgumentException("BadgeUrls cannot be null");
        }
        this.badgeUrls = badgeUrls;
    }
}