package objects;
public class Lamp {
    private Batterie batterie1;

    public Lamp(Batterie batterie1) {
        this.batterie1 = batterie1;
    }

    public void turnOn()
    {
        this.batterie1.setElectricityConsumption(this.batterie1.getElectricityConsumption()+5);
        System.out.println("Mein Name ist "+ batterie1.getName() +". Ich bin bereits eingeschaltet");
    }

    public void turnOff(){
        System.out.println("Kein Verbraucher angeschlossen");
    }

    public void turnAllOn(){

    }

    public void getOverallPowerUsage(){

    }
        public void printNamesOfLightElements(){

    }

}