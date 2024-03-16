package OOPS.Abraction_Encupsulation.Abstract;

public abstract class Abstract_extends_class extends A implements A.nest // abstract can inherit and implement
{
    int value;
    void setv()
    {
        value = num;
    }

    Abstract_extends_class()      // when abstract class been used this will one time
    {
        System.out.println("I in abstract class");
    }
    @Override
    public void Greeting() {
        System.out.println("wellcome");
    }

    abstract void Respect();
}

