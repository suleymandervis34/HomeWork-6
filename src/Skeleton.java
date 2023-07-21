public class Skeleton extends Boss {

    private int arrows;

    public int getArrows() {
        return arrows;
    }
    public String printInfo(){
        return "BOSS: " + " HEALTH: " + Boss.getHealth() + " DAMAGE: " + Boss.getDamage()
                + " WEAPON: " + Boss.getHammer().getWeapon()
                + " NAME OF THE WEAPON: " + Boss.getHammer().getNameOfWeapon() + "AMOUNT OF ARROWS "+ getArrows();
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }

    public Skeleton(int health, int damage, Weapon hammer, int arrows) {
        super(health, damage, hammer);
        this.arrows = arrows;
    }
}