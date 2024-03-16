package OOPS.Abraction_Encupsulation.Abstract;

public class Main {
    public static void main(String[] args) {
        B obj = new B();
        obj.set(25);
        System.out.println(obj.num);
        obj.setv();
        System.out.println(obj.value);
    }
}
