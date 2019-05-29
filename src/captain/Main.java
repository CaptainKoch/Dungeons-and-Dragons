package captain;

import java.util.ArrayList;

public class Main {

    //Returns true if a tile is occupied
    //Returns false if a tile is empty
    public static boolean tileOccupied(ArrayList<Player> tile){
        if (tile.size() > 0) return true;
        else return false;
    }

    public static void main(String[] args) {

        Player Nils = new Player();
        Player Tom = new Player();

        Nils.setName("Gronak - Sleeper of Men");
        Nils.setMaxHealth(30);
        Nils.setTempHealth(15);

        System.out.println("I am " + Nils.getName());

        Nils.loseHealth(8);
        Nils.gainHealth(15);
        Nils.gainHealth(15);
        Nils.loseHealth(33);
        Nils.gainHealth(2);

        //first tile
        ArrayList<Player> tile1 = new ArrayList<Player>();
            tile1.add(Nils);
            tile1.add(Tom);

        if (tileOccupied(tile1)) System.out.println("Tile 1 is occupied");
    }
}
