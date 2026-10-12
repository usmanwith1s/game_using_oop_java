
package game;

public class Enemy {

    private String name;
    private int health;
    private Weapon weapon;

    public Enemy(String name, int health, Weapon weapon) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }

    public void attack(Player player) {
        player.takeDamage(weapon.getDamage());

        System.out.println(name + " attacked "
                + player.getName() + " using "
                + weapon.getName() + "!");
    }

    public void takeDamage(int damage) {
        health -= damage;

        if (health < 0) {
            health = 0;
        }
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public Weapon getWeapon() {
        return weapon;
    }
}
