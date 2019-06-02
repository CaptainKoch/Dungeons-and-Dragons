package captain;

public class Main {


    public static void main(String[] args) {

        Player Nils = new Player();
        Nils.setName("PenisPredator69");
        Player Tom = new Player();
        Tom.setName("PussySlayer420");

        Map Forest = new Map(3, 3);

        Forest.addPlayer(Nils, 2, 3);
        Forest.addPlayer(Tom, 1,1);



    }
}
