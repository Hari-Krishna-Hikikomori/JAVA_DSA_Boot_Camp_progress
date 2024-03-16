package OOPS.Interface.OverrideIssue;

public class ElectricEngine implements Engine{

    @Override
    public void Start() {
        System.out.println("car Power on");
    }

    @Override
    public void Stop()
    {
        System.out.println("car Power off");
    }

    @Override
    public void Accelerate() {
        System.out.println("car move forward");
    }

    @Override
    public void brake() {
        System.out.println("car Stop");
    }

    @Override
    public void PowerSource() {

        System.out.println("Battery");
    }
}
