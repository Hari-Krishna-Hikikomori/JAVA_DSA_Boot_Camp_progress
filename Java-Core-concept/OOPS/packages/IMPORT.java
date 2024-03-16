package OOPS.packages; // Path of the file/class/folder/package
import OOPS.Inherritence.BoxWight;
import OOPS.Inherritence.Boxs;
import OOPS.SIngleton.SingleTon; // import property from other class or function
import OOPS.Static.STATIC;
import OOPS.Inherritence.BoxPrice; // import and check the property of Box class(super class)

public class IMPORT
{
    public static void main(String[] args) {
        // create object for with using Default constructor( new SingleTon() )
        // prevent directly creating Object for class (Singleton method)
        SingleTon obj1 = SingleTon.getinstance();
        SingleTon obj2 = SingleTon.getinstance();
        SingleTon obj3 = SingleTon.getinstance();
        // this three Reference Variable(obj1,obj2,obj3) have same Reference Address



        // this allows saturn event run once for every call (not for per call only one how time you call it)
        STATIC.function();
        STATIC.function();
        STATIC obj = new STATIC();
        obj.put(10);
        System.out.println();


        // inheriting the box and check their function
        Boxs     box   = new Boxs(10.0);                 // parent class
        BoxWight wight = new BoxWight(15,10);      // child class by using extent class can access the property of parent class ( SINGLE INHERITANCE )
        BoxPrice price = new BoxPrice(20,60);      // Chile class of Child class ( MULTI LEVEL INHERITANCE)



        price.DisplayAll();
        System.out.println();
        wight.DisplayAll();
        System.out.println();
        box.display();
        System.out.println();

        BoxPrice other = new BoxPrice();
        other.CopyofSize(box);
        other.CopyofWeight_size(wight);
        other.price();
        other.DisplayAll();


    }
}
