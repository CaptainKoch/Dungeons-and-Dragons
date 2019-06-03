package captain;

public class Main {

    public static void main(String[] args) {

        Player Nils = new Player();
        Player Tom = new Player();
        Tom.setName("PussySlayerXxX69420");
        Nils.setName("XxPenisPredatorxX");

        Map Forest = new Map(10, 10);

        Forest.addPlayer(Nils, 1, 1);
        Forest.addPlayer(Tom, 9, 9);


        Forest.movePlayer(Nils, 2, 2);
        Forest.removePlayer(Nils);

    }
}
