package com.drascop.coctracker.model;

public class Player {

    private League league;
    private PlayerClan clan;
    private String role;
    private int townHallLevel;
    private int townHallWeaponLevel;
    private String tag;
    private String name;
    private int expLevel;
    private int trophies;
    private int bestTrophies;
    private int warStars;
    private int attackWins;
    private int defenseWins;
    private String warPreference;
    private int donations;
    private int donationsReceived;
    private int clanCapitalContributions;

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
     * @param townHallWeaponLevel the town hall weapon level of the player
     * @param tag the tag of the player
     * @param name the name of the player
     * @param expLevel the experience level of the player
     * @param trophies the number of trophies the player has
     * @param bestTrophies the highest number of trophies the player has achieved
     * @param warStars the number of war stars the player has
     * @param attackWins the number of attack wins the player has
     * @param defenseWins the number of defense wins the player has
     * @param warPreference the war preference of the player
     * @param donations the number of donations the player has made
     * @param donationsReceived the number of donations the player has received
     * @param clanCapitalContributions the number of clan capital contributions the player has made
     */
    public Player(League league, PlayerClan clan, String role, int townHallLevel, int townHallWeaponLevel,
                  String tag, String name, int expLevel, int trophies, int bestTrophies, int warStars,
                  int attackWins, int defenseWins, String warPreference, int donations, int donationsReceived,
                  int clanCapitalContributions) {
        this.league = league;
        this.clan = clan;
        this.role = role;
        this.townHallLevel = townHallLevel;
        this.townHallWeaponLevel = townHallWeaponLevel;
        this.tag = tag;
        this.name = name;
        this.expLevel = expLevel;
        this.trophies = trophies;
        this.bestTrophies = bestTrophies;
        this.warStars = warStars;
        this.attackWins = attackWins;
        this.defenseWins = defenseWins;
        this.warPreference = warPreference;
        this.donations = donations;
        this.donationsReceived = donationsReceived;
        this.clanCapitalContributions = clanCapitalContributions;
    }

    // Getters and Setters
    public League getLeague() {
        return league == null ? null : new League(league);
    }

    public void setLeague(League league) {
        if (league == null) {
            throw new IllegalArgumentException("League cannot be null");
        }
        this.league = new League(league);
    }

    public PlayerClan getClan() {
        return clan == null ? null : new PlayerClan(clan);
    }

    public void setClan(PlayerClan clan) {
        if (clan == null) {
            throw new IllegalArgumentException("Clan cannot be null");
        }
        this.clan = new PlayerClan(clan);
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
        if (townHallLevel < 0) {
            throw new IllegalArgumentException("Town Hall Level cannot be negative");
        }
        this.townHallLevel = townHallLevel;
    }

    public int getTownHallWeaponLevel() {
        return townHallWeaponLevel;
    }

    public void setTownHallWeaponLevel(int townHallWeaponLevel) {
        if (townHallWeaponLevel < 0) {
            throw new IllegalArgumentException("Town Hall Weapon Level cannot be negative");
        }
        this.townHallWeaponLevel = townHallWeaponLevel;
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
        if (expLevel < 0) {
            throw new IllegalArgumentException("Experience Level cannot be negative");
        }
        this.expLevel = expLevel;
    }

    public int getTrophies() {
        return trophies;
    }

    public void setTrophies(int trophies) {
        if (trophies < 0) {
            throw new IllegalArgumentException("Trophies cannot be negative");
        }
        this.trophies = trophies;
    }

    public int getBestTrophies() {
        return bestTrophies;
    }

    public void setBestTrophies(int bestTrophies) {
        if (bestTrophies < 0) {
            throw new IllegalArgumentException("Best Trophies cannot be negative");
        }
        this.bestTrophies = bestTrophies;
    }

    public int getWarStars() {
        return warStars;
    }

    public void setWarStars(int warStars) {
        if (warStars < 0) {
            throw new IllegalArgumentException("War Stars cannot be negative");
        }
        this.warStars = warStars;
    }

    public int getAttackWins() {
        return attackWins;
    }

    public void setAttackWins(int attackWins) {
        if (attackWins < 0) {
            throw new IllegalArgumentException("Attack Wins cannot be negative");
        }
        this.attackWins = attackWins;
    }

    public int getDefenseWins() {
        return defenseWins;
    }

    public void setDefenseWins(int defenseWins) {
        if (defenseWins < 0) {
            throw new IllegalArgumentException("Defense Wins cannot be negative");
        }
        this.defenseWins = defenseWins;
    }

    public String getWarPreference() {
        return warPreference;
    }

    public void setWarPreference(String warPreference) {
        if (warPreference == null || warPreference.isEmpty()) {
            throw new IllegalArgumentException("War Preference cannot be null or empty");
        }
        this.warPreference = warPreference;
    }

    public int getDonations() {
        return donations;
    }

    public void setDonations(int donations) {
        if (donations < 0) {
            throw new IllegalArgumentException("Donations cannot be negative");
        }
        this.donations = donations;
    }

    public int getDonationsReceived() {
        return donationsReceived;
    }

    public void setDonationsReceived(int donationsReceived) {
        if (donationsReceived < 0) {
            throw new IllegalArgumentException("Donations Received cannot be negative");
        }
        this.donationsReceived = donationsReceived;
    }

    public int getClanCapitalContributions() {
        return clanCapitalContributions;
    }

    public void setClanCapitalContributions(int clanCapitalContributions) {
        if (clanCapitalContributions < 0) {
            throw new IllegalArgumentException("Clan Capital Contributions cannot be negative");
        }
        this.clanCapitalContributions = clanCapitalContributions;
    }
}
