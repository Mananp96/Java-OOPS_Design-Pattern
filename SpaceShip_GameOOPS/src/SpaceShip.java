import java.util.ArrayList;
import java.util.List;

/**
 *  ******* SpaceShip Customization ********
 *
 * SpaceShip Size: Small, Medium, Large
 *
 *  SPACESHIP SIZES      ENGINE      WEAPON
 *      Small              1            2
 *      Medium             3            5
 *      Large              5            9
 *
 * -- SpaceShip can have multiple Engines --
 *      Engine:
 *      types of Engine: 1. vehicle (old school rockets)
 *                       2. Ion
 *                       3. Nuclear
 *
 * -- SpaceShip can have multiple Weapons --
 *       Weapons:
 *       types of Weapons: 1. Kinetic (bullets)
 *                         2. Missiles
 *                         3. Lasers
 */

enum SpaceShipSize {SMALL, MEDIUM, LARGE};

public class SpaceShip {
    private String name;
    private SpaceShipSize size;
    private int totalEngineCapacity;
    private int totalWeaponCapacity;

    private List<Engine> engines = new ArrayList<>();
    private List<Weapon> weapons = new ArrayList<>();

    SpaceShip(String name, SpaceShipSize size) {
        this.name = name;
        this.size = size;

        if(this.size == SpaceShipSize.SMALL){
            this.totalEngineCapacity = 1;
            this.totalWeaponCapacity = 2;
        }else if(this.size == SpaceShipSize.MEDIUM){
            this.totalEngineCapacity = 3;
            this. totalWeaponCapacity = 5;
        }else if(this.size == SpaceShipSize.LARGE){
            this.totalEngineCapacity = 5;
            this.totalWeaponCapacity = 9;
        }
    }

    void loadWeapon(WeaponTypes weaponType) {
        if(weapons.size() < this.totalWeaponCapacity){
            Weapon weapon = this.getWeaponObject(weaponType);
            weapons.add(weapon);
        }else{
            System.out.println("No more slots available to add Weapons");
        }
    }

    void loadEngine(EngineTypes engineType) {
        if(engines.size() < this.totalEngineCapacity){
            Engine engine = this.getEngineObject(engineType);
            engines.add(engine);
        }else{
            System.out.println("No more slots available to add Engines");
        }
    }

    private Engine getEngineObject(EngineTypes engineType) {
        Engine engine = null;
        switch(engineType){
            case VEHICLE:
                engine = new VehicleEngine();
                break;
            case ION:
                engine = new IonEngine();
                break;
            case NUCLEAR:
                engine = new NuclearEngine();
                break;
            default:
                System.out.println("Invalid Engine Type");
        }
        return engine;
    }

    private Weapon getWeaponObject(WeaponTypes weaponTypes) {
        Weapon weapon = null;
        switch(weaponTypes) {
            case KINETIC:
                weapon = new Kinetic();
                break;
            case MISSILES:
                weapon = new Missiles();
                break;
            case LASER:
                weapon = new Laser();
                break;
            default:
                System.out.println("Invalid Weapon Type");
        }
        return weapon;
    }

    public SpaceShipSize getSize() {
        return size;
    }

    public int getTotalEngineCapacity() {
        return totalEngineCapacity;
    }

    public int getTotalWeaponCapacity() {
        return totalWeaponCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Engine> getEngines() {
        return engines;
    }

    public List<Weapon> getWeapons() {
        return weapons;
    }

    @Override
    public String toString() {
        return "SpaceShip{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", totalEngineCapacity=" + totalEngineCapacity +
                ", totalWeaponCapacity=" + totalWeaponCapacity +
                ", engines=" + engines +
                ", weapons=" + weapons +
                '}';
    }
}


