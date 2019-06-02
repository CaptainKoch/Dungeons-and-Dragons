package captain;

public class Map {

    public Map(int row, int col) {
        Tile[][] Map = new Tile[row][col];
    }

    public void addPlayer(Player newPlayer, int row, int col) {
        Map[row][col] = newPlayer;
    }
}
