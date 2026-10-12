
package game;

public class Main {

    public static void main(String[] args) {

        Weapon sword = new Weapon("Iron Sword", 35);
        Weapon claws = new Weapon("Goblin Claws", 15);

        Player player = new Player("Usman", 100, sword);
        Enemy enemy = new Enemy("Goblin", 80, claws);

        Battle battle = new Battle(player, enemy);
        battle.start();
    }
}
