public class Boss extends GameEntity{
    public static Weapon hammer;
    public String printInfo(){
        return "BOSS: " + " HEALTH: " + Boss.getHealth() + " DAMAGE: " + Boss.getDamage()
                + " WEAPON: " + Boss.getHammer().getWeapon()
                + " NAME OF THE WEAPON: " + Boss.getHammer().getNameOfWeapon();
    }
    public Boss(int health, int damage, Weapon hammer){
        super(health, damage);
        this.hammer=hammer;
    }
    public static Weapon getHammer() {
        return hammer;
    }

    public void setHammer(Weapon hammer) {
        this.hammer = hammer;
    }
}