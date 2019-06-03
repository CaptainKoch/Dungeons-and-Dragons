package captain;

public class Map {

    //Initializer
    private Tile[][] Map;

    //Constructor
    public Map(int row, int col) {
        Map = new Tile[row][col];
        for (int i = 0; i < Map.length ; i++) {
            for (int j = 0; j < Map[i].length; j++) {
                Map[i][j] = new Tile();
            }
        }
    }

    public Tile findPlayer(Player lostPlayer) { int x = 0; int y = 0;
        for (int i = 0; i < Map.length; i++) {
            for (int j = 0; j < Map[i].length; j++) {
                if (Map[i][j].playerOnTile(lostPlayer)) x = i; y = j;
            }
        } return Map[x][y];
    }

    public void addPlayer(Player newPlayer, int row, int col) {
        Map[col][row].addPlayer(newPlayer);
    }

    public void removePlayer(Player playerToRemove) {
        findPlayer(playerToRemove).removePlayer(playerToRemove);
    }

    public void movePlayer(Player playerToMove, int row, int col) {
        findPlayer(playerToMove).removePlayer(playerToMove);
        addPlayer(playerToMove, row, col);
    }
}
