public class Engine {
    private String engineName;

    Engine(String engineName) {
        this.engineName = engineName;
    }

    public String getEngineName() {
        return engineName;
    }
}

enum EngineTypes {VEHICLE, ION, NUCLEAR};

class VehicleEngine extends Engine {

    VehicleEngine(){
        super("vehicle");
        System.out.println("Installed Vehicle Engine");
    }
}

class IonEngine extends Engine {

    IonEngine(){
        super("Ion");
        System.out.println("Installed Ion Engine");
    }
}

class NuclearEngine extends Engine {

    NuclearEngine(){
        super("Nuclear");
        System.out.println("Installed Nuclear Engine");
    }
}