package captain;

public class Map {
    private Tile[][] Map;

    public Map(int row, int col) {
        Map = new Tile[row][col];
    }


    public void addPlayer(Player newPlayer, int row, int col) {
        Map[row][col].addPlayer(newPlayer);
    }
}
