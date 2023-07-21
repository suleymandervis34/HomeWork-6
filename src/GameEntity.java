public class GameEntity {
    public static int health;
    public static int damage;

    public GameEntity(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public static int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public static int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}