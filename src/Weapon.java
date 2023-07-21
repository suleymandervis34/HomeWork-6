public class Weapon {
    private  WeaponType weapon;
    private  String nameOfWeapon;

    public Weapon(WeaponType weapon, String nameOfWeapon) {
        super();
        this.weapon = weapon;
        this.nameOfWeapon = nameOfWeapon;
    }


    public WeaponType getWeapon() {
        return weapon;
    }

    public void setWeapon(WeaponType weapon) {
        this.weapon = weapon;
    }

    public String getNameOfWeapon() {
        return nameOfWeapon;
    }

    public void setNameOfWeapon(String nameOfWeapon) {
        this.nameOfWeapon = nameOfWeapon;
    }
}