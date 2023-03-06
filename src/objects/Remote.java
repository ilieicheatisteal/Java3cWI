package objects;

public class Remote {
    private Battery battery1;
    private Battery battery2;

    public Remote(Battery battery1, Battery battery2) {
        this.battery1 = battery1;
        this.battery2 = battery2;
    }


    public void turnOn()
    {
        this.battery1.setChargingStatus(this.battery1.getChargingStatus()-5);
        this.battery2.setChargingStatus(this.battery2.getChargingStatus()-5);
        System.out.println("Verbraucher angeschlossen");
    }

    public void turnOff(){
        System.out.println("Kein Verbraucher angeschlossen");
    }

    public float getStatus(){
        float mw = (this.battery1.getChargingStatus() + this.battery2.getChargingStatus())/2;
        return mw;
    }
}