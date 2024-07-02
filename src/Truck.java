public class Truck extends MotorTransport {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void updateTyre() {
            System.out.println("Меняем покрышку у грузовика ");
    }
    public void checkEngine() {
            System.out.println("Снимаем кабину, проверяем двигатель");
    }
    public void checkTrailer() {
            System.out.println("Проверяем прицеп");
    }
    public void service() {
            updateTyre();
            checkEngine();
            checkTrailer();
    }
}

