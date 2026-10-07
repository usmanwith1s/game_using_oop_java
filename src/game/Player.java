package game;

public class Player {

    private String name;
    private int health;

    public Player(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void attack(Enemy enemy) {
        enemy.takeDamage(20);
        System.out.println(name + " attacked " + enemy.getName());
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }
}
