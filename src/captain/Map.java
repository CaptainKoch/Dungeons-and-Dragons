package captain;

public class Map {

    private Tile[][] Map;

    public Map(int row, int col) {
        Map = new Tile[row][col];
        for (int i = 0; i < Map.length ; i++) {
            for (int j = 0; j < Map[i].length; j++) {
                Map[i][j] = new Tile();
            }
        }
    }

    public void addPlayer(Player newPlayer, int row, int col) {
        Map[col][row].addPlayer(newPlayer);
    }

    public void removePlayer(Player playerToRemove) {
        for (int i = 0; i < Map.length; i++) {
            for (int j = 0; j < Map[i].length; j++) {
                if (Map[i][j].playerOnTile(playerToRemove)) {
                    Map[i][j].removePlayer(playerToRemove);
                }
            }
        }
    }

    public void findPlayer(Player lostPlayer) {
        for (int i = 0; i < Map.length; i++) {
            for (int j = 0; j < Map[i].length; j++) {
                if (Map[i][j].playerOnTile(lostPlayer)) {
                    System.out.println(lostPlayer.getName() + " is on Tile [" + i + "][" + j + "]");
                }
                if (i == Map.length && (Map[i][j].playerOnTile(lostPlayer) == false)) {
                    System.out.println("Player not found");
                }
            }
        }
    }

    public void movePlayer(Player playerToMove, int row, int col) {
        for (int i = 0; i < Map.length; i++) {
            for (int j = 0; j < Map[i].length; j++) {
                if (Map[i][j].playerOnTile(playerToMove)) {
                    Map[i][j].removePlayer(playerToMove);
                    Map[col][row].addPlayer(playerToMove);
                    System.out.println("Player moved");
                    break;
                }
            }
            if (Map[row][col].playerOnTile(playerToMove)) break;
        }
    }

}
