package captain;

public class Main {

    public static void main(String[] args) {

        Player Nils = new Player();

        Nils.setName("Gronak - Sleeper of Men");
        Nils.setMaxHealth(30);
        Nils.setTempHealth(15);

        System.out.println("I am " + Nils.getName());

        Nils.loseHealth(8);
        Nils.gainHealth(15);
        Nils.gainHealth(15);
        Nils.loseHealth(33);
        Nils.gainHealth(2);
    }
}
