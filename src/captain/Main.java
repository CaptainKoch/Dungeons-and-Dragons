package captain;

public class Main {

    public static void main(String[] args) {

        Player Nils = new Player();
        Player Tom = new Player();

        Map Forest = new Map(10, 10);

        Forest.addPlayer(Nils, 1, 1);
    }
}
