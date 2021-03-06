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
    }

    public void removePlayer(Player playerToRemove) {
        players.remove(playerToRemove);
        occupiedByPlayer = false;
    }

    public boolean playerOnTile(Player playerToFind) {
        for (int i = 0; i < players.size(); i++) {
            if (players.get(i) == playerToFind) {
                return true;
            }
        }
        return false;
    }
}
