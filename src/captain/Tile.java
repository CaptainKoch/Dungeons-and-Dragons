package captain;

import java.util.ArrayList;

public class Tile {
    private ArrayList<Player> players = new ArrayList<Player>();

    public boolean isOccupied() {
        if (players.size() > 0) return true;
        else return false;
    }

    public void addPlayer(Player newPlayer) {
        players.add(newPlayer);
    }

    public void removePlayer(Player playerToRemove) {
        players.remove(playerToRemove);
    }

}
