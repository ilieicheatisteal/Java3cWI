package objects;

public class car {
    public int totalFuel;

    public int amountOfRepetitions;
    public int fuelConsumption;
    public int fuelAmount;
    public String brand;
    public String serialNumber;
    public String color;
    public int horsePower;

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


}



