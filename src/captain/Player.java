package captain;

public class Player {

    private String name;
    private int tempHealth;
    private int maxHealth;


    /*Taking Damage and / or losing health*/

    public void loseHealth(int damage) {
        if (damage < tempHealth) {
            tempHealth -= damage;
            System.out.println(name + " took " + damage + ". He has " + tempHealth + " health left!");
        }
        else {
            tempHealth -= damage;
            System.out.println(name + " died...");
        }
    }

    /*Healing or Gaining Health*/

    public void gainHealth(int heal) {
        if (tempHealth > 0) {
            if (maxHealth >= tempHealth + heal) {
                tempHealth += heal;
                System.out.println(name + " has been healed for " + heal + " hitpoints. He now has " + tempHealth + " hitpoints left!");
            }
            else {
                tempHealth = maxHealth;
                System.out.println(name + " has been healed and is now at full health (" + tempHealth + " HP)!");
            }
        } else System.out.println("A dead target can not be healed");
    }

    /* GETTERS AND SETTERS */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTempHealth() {
        return tempHealth;
    }

    public void setTempHealth(int tempHealth) {
        this.tempHealth = tempHealth;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }
}
