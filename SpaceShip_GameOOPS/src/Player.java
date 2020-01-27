public class Player {
    public static void main(String[] args) {
        SpaceShip spaceShip = new SpaceShip("MySpaceCraft",SpaceShipSize.SMALL);
        System.out.println(spaceShip.toString());
        spaceShip.loadEngine(EngineTypes.NUCLEAR);
        spaceShip.loadWeapon(WeaponTypes.LASER);
        System.out.println("After loading engine and weapon...in "+spaceShip.getName());
        System.out.println(spaceShip.toString());
        spaceShip.loadEngine(EngineTypes.ION);
        spaceShip.loadWeapon(WeaponTypes.KINETIC);
        System.out.println("After loading another engine and weapon...in "+spaceShip.getName());
        System.out.println(spaceShip.toString());
    }
}
