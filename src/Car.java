public class Car extends Vehicles implements CheckVehicles {


    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        super.check();
    }

    @Override
    public void checkEngine() {
        super.checkEngine();
    }

    @Override
    public void updateTyre() {
        super.updateTyre();
    }
}
