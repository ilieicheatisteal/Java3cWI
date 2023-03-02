package objects;

import java.util.List;

public class Car {
    public int totalFuel;

    public int amountOfRepetitions;
    public int fuelConsumption;
    public int fuelAmount;
    public String brand;
    public String serialNumber;
    public String color;
    public int horsePower;

    public String Engine;

    private List<RearMirror> mirrors;

    private List<Tires> tires;
    public Car(String engine, int fc, String b, String s, int hp, String c, int honk){
        this.fuelConsumption = fc;
        this.brand = b;
        this.serialNumber = s;
        this.horsePower = hp;
        this.color = c;
        this.amountOfRepetitions = honk;
        this.Engine = engine;
    }
public void addMirror(RearMirror rearMirror){
        this.mirrors.add(rearMirror);
}


    public void turboBoost(){
       if(fuelAmount> totalFuel*0.1)
           System.out.println("SuperBoostMode");
       else
           System.out.println("Not enough fuel to go to Superboost.");

       }
    public void drive(){
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("I am driving");
    }

    public void honk(int amountOfRepetitions) {
            for (int i = amountOfRepetitions; i > 0; i--)
                System.out.println("Tuut");
        }

    public void getRemainingRange() {
        System.out.println(fuelAmount / fuelConsumption);
    }

    public void setTank (int tank){
        fuelAmount = tank;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setColor(String color){
        this.color = color;
    }
    public void setFuelAmount(int fuelAmount){
        this.fuelAmount = fuelAmount;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setTotalFuel(int totalFuel) {
        this.totalFuel = totalFuel;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getTotalFuel() {
        return totalFuel;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getEngine(){
        return Engine;
    }

    public void setEngine(String engine) {
        this.Engine = engine;
    }



}



