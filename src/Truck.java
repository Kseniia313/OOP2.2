
public class Truck extends Vehicles implements CheckVehicles{


    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        super.check();
    }

    @Override
    public void updateTyre() {
        super.updateTyre();
    }

    @Override
    public void checkEngine() {
        super.checkEngine();
    }

    @Override
    public void checkTrailer() {
        super.checkTrailer();
    }
}
