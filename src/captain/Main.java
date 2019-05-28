package captain;

public class Main {

    public static void main(String[] args) {

        Player Nils = new Player();

        Nils.setPlayerName("Gronak - Sleeper of Men");
        Nils.setPlayerMaxHealth(30);
        Nils.setPlayerTempHealth(15);

        System.out.println("I am " + Nils.playerName);

        Nils.loseHealth(8);
        Nils.gainHealth(15);
        Nils.gainHealth(15);
        Nils.loseHealth(33);
        Nils.gainHealth(2);
    }
}
