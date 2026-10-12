
package game;

public class Main {

    public static void main(String[] args) {

        Weapon sword = new Weapon("Iron Sword", 35);
        Weapon claws = new Weapon("Goblin Claws", 15);

        Player player = new Player("Usman", 100, sword);
        Enemy enemy = new Enemy("Goblin", 80, claws);

        System.out.println("=== RPG BATTLE ===");
        System.out.println(player.getName() + " vs "
                + enemy.getName());

        player.attack(enemy);
        enemy.attack(player);

        System.out.println();
        System.out.println(player.getName()
                + " HP: " + player.getHealth());
        System.out.println(enemy.getName()
                + " HP: " + enemy.getHealth());
    }
}
