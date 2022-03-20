package sit.int204.lab01.beans;

public class Car {
    private String chasisNumber ;
    private String brand;
    private Engine engine;
    public Car() { }
    public Car(String chasisNumber, String brand, Engine engine) {
        this.chasisNumber = chasisNumber;
        this.brand = brand;
        this.engine = engine;
    }
    public void start() {
        engine.turnOn();
    }

    public void setChasisNumber(String chasisNumber) {
        this.chasisNumber = chasisNumber;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car: "+ chasisNumber + " - " + brand
                + ", " + engine.getCapacity();
    }
}
