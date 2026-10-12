
package game;

public class Battle {

    private Player player;
    private Enemy enemy;

    public Battle(Player player, Enemy enemy) {
        this.player = player;
        this.enemy = enemy;
    }

    public void start() {
        System.out.println("=== BATTLE START ===");

        while (player.isAlive() && enemy.isAlive()) {

            player.attack(enemy);
            System.out.println("Enemy HP: " + enemy.getHealth());

            if (!enemy.isAlive()) {
                break;
            }

            enemy.attack(player);
            System.out.println("Player HP: " + player.getHealth());

            System.out.println("--------------------");
        }

        if (player.isAlive()) {
            System.out.println("VICTORY! You defeated "
                    + enemy.getName() + "!");
        } else {
            System.out.println("DEFEAT! Better luck next time.");
        }
    }
}
