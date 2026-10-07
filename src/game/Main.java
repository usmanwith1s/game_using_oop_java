package game;

public class Main {

    public static void main(String[] args) {

        Player player = new Player("Usman", 100);
        Enemy enemy = new Enemy("Goblin", 80);

        Game game = new Game(player, enemy);

        game.startBattle();
    }
}
