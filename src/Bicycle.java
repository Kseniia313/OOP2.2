
public class Bicycle extends Vehicles implements CheckVehicles {
    public Bicycle(String modelName, int wheelsCount) {
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
}
