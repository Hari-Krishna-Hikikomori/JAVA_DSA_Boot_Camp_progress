package OOPS.Abraction_Encupsulation;

public class MAIN
{
    public static void main(String[] args) {
        Box_Encupsulation boxobj = new Box_Encupsulation();
        Cube_Encupsulation cubeobj = new Cube_Encupsulation();

        // hashCode
        System.out.println(boxobj.hashCode());  // default one
        System.out.println(cubeobj.hashCode()); // own modified
        System.out.println();

        System.out.println(boxobj.toString());  // default one
        System.out.println(cubeobj.toString()); // own modified
        System.out.println();

        Cube_Encupsulation cubeob2 = new Cube_Encupsulation();
        Box_Encupsulation boxobj2 = new Box_Encupsulation();
        System.out.println(boxobj.equals(boxobj2));   // default one
        System.out.println(cubeobj.equals(cubeob2));  // own modified
        System.out.println();

        // instance Operator
        System.out.println(boxobj instanceof Box_Encupsulation);  // this will show that this object is instanceof(his class & his parent class)
        System.out.println(boxobj2 instanceof Abstraction);
        System.out.println();

        // getclass this will allow as to know the info about a class
        System.out.println(cubeobj.getClass());
        System.out.println(cubeobj.getClass().getMethods());
        System.out.println(cubeobj.getClass().getFields());
        System.out.println(cubeobj.getClass().getName());
        System.out.println(cubeobj.getClass().getPackage());
        System.out.println(cubeobj.getClass().getPackageName());
        System.out.println(cubeobj.getClass().getPermittedSubclasses());
    }
}
