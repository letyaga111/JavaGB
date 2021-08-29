import java.util.Random;
import java.util.Scanner;

public class HomeWork04 {

    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);

    public static char playerMarker = '@';
    public static int playerHealth = 100;
    public static int playerAttack = 20;
    public static int playerPositionX;
    public static int playerPositionY;
    public static final int PLAYER_MOVE_UP = 8;
    public static final int PLAYER_MOVE_DOWN = 2;
    public static final int PLAYER_MOVE_LEFT = 4;
    public static final int PLAYER_MOVE_RIGHT = 6;

    public static char enemyMarker = '#';
    public static int enemyHealth = 100;
    public static int enemyAttack = 20;
    public static int enemyValueMin;
    public static int enemyValueMax;

    public static char[][] map;
    public static char[][] invisibleMap;
    public static int mapWidth;
    public static int mapHeight;
    public static int mapValueMin = 3;
    public static int mapValueMax = 6;

    public static char mapEmpty = '_';
    public static char mapVisited = '*';
    public static int levelCount = 0;

    public static void main(String[] args) {
        createMap();
        printMap();
    }

    public static void createMap() {
        mapWidth = randomValue(mapValueMin, mapValueMax);
        mapHeight = randomValue(mapValueMin, mapValueMax);
        map = new char[mapHeight][mapWidth];
        invisibleMap = new char[mapHeight][mapWidth];
        for (int y = 0; y < mapHeight; y++) {
            for (int x = 0; x < mapWidth; x++) {
                map[y][x] = mapEmpty;
            }
        }
        System.out.println("Создана карта. Размер " + mapWidth + "x" + mapHeight + ".");
    }

    public static void printMap() {
        for (int y = 0; y < mapHeight; y++) {
            for (int x = 0; x < mapWidth; x++) {
                System.out.print(map[y][x] + "|");
            }
            System.out.println();
        }
    }

    public static int randomValue(int min, int max) {
        return min + random.nextInt(max - min + 1);
    }
}
