package OOPS.Interface.OverrideIssue;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Engine El = new ElectricEngine(); // both are reference come from engine
                                          // with help of run time polymorphism(override) we can change engine values


        car.Start();
        car.Stop();
        car.PowerSource();
        car.UpgradeEngine(El);
        car.PowerSource();
    }
}
