package objects;

public class 9Engine {
    private enum TYPE {DIESEL, GAS}

    private int horsePower;
    private TYPE type;

    public Engine(int horsepower, TYPE type) {
        this.horsePower = horsepower;
        this.type = type;
    }

    public void drive(int amount) {
        System.out.println("the motor is running with " + amount);
    }

    public int getHorsePower() {
        return horsePower;
    }

    public TYPE getType() {
        return type;
    }

}