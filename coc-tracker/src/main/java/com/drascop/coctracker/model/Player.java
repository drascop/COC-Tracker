package com.drascop.coctracker.model;

public class Player {

    private League league;
    private PlayerClan clan;
    private String role;
    private int townHallLevel;
    private String tag;
    private String name;
    private int expLevel;
    private int trophies;
    private int bestTrophies;
    private int warStars;
    

    /**
     * Default constructor.
     */
    public Player() {
    }


    /**
     * Constructor with all fields.
     *
     * @param league the league of the player
     * @param clan the clan of the player
     * @param role the role of the player
     * @param townHallLevel the town hall level of the player
     * @param tag the tag of the player
     * @param name the name of the player
     * @param expLevel the experience level of the player
     * @param trophies the number of trophies the player has
     * @param bestTrophies the highest number of trophies the player has achieved
     * @param warStars the number of war stars the player has
     */
    public Player(League league, PlayerClan clan, String role, int townHallLevel, 
                 String tag, String name, int expLevel, int trophies, 
                 int bestTrophies, int warStars) {
        this.league = league;
        this.clan = clan;
        this.role = role;
        this.townHallLevel = townHallLevel;
        this.tag = tag;
        this.name = name;
        this.expLevel = expLevel;
        this.trophies = trophies;
        this.bestTrophies = bestTrophies;
        this.warStars = warStars;
    }


    /**
     * Getters and setters below
     */

    public League getLeague() {
        return league;
    }


    public void setLeague(League league) {
        if (league == null) {
            throw new IllegalArgumentException("League cannot be null");
        }
        this.league = league;
    }


    public PlayerClan getClan() {
        return clan;
    }


    public void setClan(PlayerClan clan) {
        if (clan == null) {
            throw new IllegalArgumentException("Clan cannot be null");
        }
        this.clan = clan;
    }


    public String getRole() {
        return role;
    }


    public void setRole(String role) {
        if (role == null || role.isEmpty()) {
            throw new IllegalArgumentException("Role cannot be null or empty");
        }
        this.role = role;
    }


    public int getTownHallLevel() {
        return townHallLevel;
    }


    public void setTownHallLevel(int townHallLevel) {
        this.townHallLevel = townHallLevel;
    }


    public String getTag() {
        return tag;
    }


    public void setTag(String tag) {
        if (tag == null || tag.isEmpty()) {
            throw new IllegalArgumentException("Tag cannot be null or empty");
        }
        this.tag = tag;
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


    public int getExpLevel() {
        return expLevel;
    }


    public void setExpLevel(int expLevel) {
        this.expLevel = expLevel;
    }


    public int getTrophies() {
        return trophies;
    }


    public void setTrophies(int trophies) {
        this.trophies = trophies;
    }


    public int getBestTrophies() {
        return bestTrophies;
    }


    public void setBestTrophies(int bestTrophies) {
        this.bestTrophies = bestTrophies;
    }


    public int getWarStars() {
        return warStars;
    }


    public void setWarStars(int warStars) {
        this.warStars = warStars;
    }
}
