public class Main {
    public static void main(String[] args) {
        Boss villain;
        villain = new Boss(700, 50, new Weapon(WeaponType.HAMMER,"Thunder"));

        System.out.println(villain.printInfo());

        Skeleton skeleton1 = new Skeleton(400, 30,new Weapon(WeaponType.BOW, "Normal "),10);
        Skeleton skeleton2 = new Skeleton(380, 30, new Weapon(WeaponType.BOW,"Normal "),10);
        System.out.println(skeleton1.printInfo());
        System.out.println(skeleton2.printInfo());



        /*System.out.print("BOSS: " + " HEALTH: " + villain.getHealth() + " DAMAGE: " + villain.getDamage()
                + " WEAPON: " + villain.getHammer().getWeapon()
                + " NAME OF THE WEAPON: " + villain.getHammer().getNameOfWeapon());*/

    }
}