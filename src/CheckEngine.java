public abstract class CheckEngine extends Vehicles {
    public CheckEngine(String modelName, int wheelsCount){
        super(modelName, wheelsCount);
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

}
