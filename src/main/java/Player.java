public class Player {
    public String playerName;
    public int level;

    /**
     * Constructor that sets the playerName to the given parameter and level to 1 by default.
     *
     * @param playerName the name of the player to be created.
     */
    public Player(String playerName){
        this.playerName = playerName;
        this.level = 1;
    }

    /**
     * Constructor that sets the playerName and level to the given parameters.
     *
     * @param playerName the name of the player to be created.
     * @param level the starting level of the player to be created.
     */
    public Player(String playerName, int level){
        this.playerName = playerName;
        this.level = level;
    }
}
