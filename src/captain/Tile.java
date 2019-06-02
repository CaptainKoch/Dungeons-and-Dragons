package captain;

import java.util.ArrayList;

public class Tile {
    private ArrayList<Player> players = new ArrayList<Player>();
    private boolean occupiedByPlayer = false;

    public boolean occupiedByPlayer() {
        if (occupiedByPlayer) return true;
        else return false;
    }

    public void addPlayer(Player newPlayer) {
        players.add(newPlayer);
        occupiedByPlayer = true;
        System.out.println("Player added");
    }

    public void removePlayer(Player playerToRemove) {
        players.remove(playerToRemove);
        occupiedByPlayer = false;
        System.out.println("Player removed");
    }


}
