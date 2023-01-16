import objects.Car;

public class Objektorientierung1 {
    public static void main(String[] args) {
        int a = 7;
/*
        car c1 = new car();
        c1.brand = "Audi";
        c1.fuelConsumption = 7;
        c1.serialNumber = "A1234";
        c1.fuelAmount = 70;
        c1.totalFuel = 90;
        c1.amountOfRepetitions = 3;
        c1.color = "blue";
        c1.horsePower = 200;

        car c2 = new car();
        c2.brand = "Mercedes";
        c2.fuelConsumption = 6;
        c2.serialNumber = "M1234";
        c2.fuelAmount = 20;
        c2.totalFuel = 35;
        c2.amountOfRepetitions = 5;
        c2.color = "red";
        c2.horsePower = 300;
*/
        car c3 = new car("LS",3,"Nissan", "1951",400, "yellow",5);

        System.out.println(c3.serialNumber);

    }
}
