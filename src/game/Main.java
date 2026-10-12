
package game;

public class Main {

    public static void main(String[] args) {

        Weapon sword = new Weapon("Iron Sword", 35);

        Player player = new Player("Usman", 100, sword);
        Enemy enemy = new Enemy("Goblin", 80);

        System.out.println("=== RPG BATTLE ===");
        System.out.println("Player: " + player.getName());
        System.out.println("Weapon: " + player.getWeapon().getName());

        player.attack(enemy);

        System.out.println("Player HP: " + player.getHealth());
        System.out.println("Enemy HP: " + enemy.getHealth());
    }
}
