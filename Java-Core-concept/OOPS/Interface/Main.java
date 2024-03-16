package OOPS.Interface;

public class Main extends Son{
    public static void main(String[] args)
    {
        Son son = new Son();
        Parent obj = new Son();

        Daughter daughter = new Daughter();
        Parent obj2 = new Daughter();

        son.Career();
        Son.Life();
        obj.Partner();
        System.out.println();

        daughter.Career();
        Daughter.Life();
        obj2.Partner();
    }
}
