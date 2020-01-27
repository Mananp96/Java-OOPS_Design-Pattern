public interface Weapon {
    void launchWeapon();
}

enum WeaponTypes {MISSILES, KINETIC, LASER};

class Missiles implements Weapon{

    Missiles() {
        System.out.println("Missile Weapon Installed.");
    }

    @Override
    public void launchWeapon() {
        System.out.println("Launched Missile");
    }
}

class Kinetic implements Weapon{

    Kinetic() {
        System.out.println("Kinetic Weapon Installed.");
    }

    @Override
    public void launchWeapon() {
        System.out.println("Launched Kinetic");
    }
}

class Laser implements Weapon{

    Laser() {
        System.out.println("Laser Weapon Installed.");
    }

    @Override
    public void launchWeapon() {
        System.out.println("Launched Laser");
    }
}