package captain;

public class Player {
    String playerName;

    private int playerTempHealth;
    private int playerMaxHealth;


    /*Taking Damage and / or losing health*/

    public void loseHealth(int damage) {
        if (damage < playerTempHealth) {
            playerTempHealth -= damage;
            System.out.println(playerName + " took " + damage + ". He has " + playerTempHealth + " health left!");
        }
        else {
            playerTempHealth -= damage;
            System.out.println(playerName + " died...");
        }
    }

    /*Healing or Gaining Health*/

    public void gainHealth(int heal) {
        if (playerTempHealth > 0) {
            if (playerMaxHealth >= playerTempHealth + heal) {
                playerTempHealth += heal;
                System.out.println(playerName + " has been healed for " + heal + " hitpoints. He now has " + playerTempHealth + " hitpoints left!");
            }
            else {
                playerTempHealth = playerMaxHealth;
                System.out.println(playerName + " has been healed and is now at full health (" + playerTempHealth + " HP)!");
            }
        } else System.out.println("A dead target can not be healed");
    }

    /* GETTERS AND SETTERS */

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerTempHealth() {
        return playerTempHealth;
    }

    public void setPlayerTempHealth(int playerTempHealth) {
        this.playerTempHealth = playerTempHealth;
    }

    public int getPlayerMaxHealth() {
        return playerMaxHealth;
    }

    public void setPlayerMaxHealth(int playerMaxHealth) {
        this.playerMaxHealth = playerMaxHealth;
    }
}
