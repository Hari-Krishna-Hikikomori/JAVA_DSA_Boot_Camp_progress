import java.util.Scanner;
 class newemp
{
    public String name;
    public int age;
    public String emailid;
    public String address;
    public int phoneno;

    static void newcreate(String name,String emailid) 
    {
        

    }
        
} 

public class createemp{
    public static void main(String[] args) {
        System.out.println("log in  - 0" );
        System.out.println("new emp - 1");
        System.out.println("");
        Scanner ar= new Scanner(System.in);
        Scanner bc= new Scanner(System.in);
        System.out.println("");
        System.out.println("Enter are detail followed by ");
        int user = bc.nextInt();
        if (user==1){
        System.out.print("Name              :");
        String name = ar.nextLine();
        System.out.print("Age               :");
        int age = ar.nextInt();
        System.out.print("phone number    :");
        
        System.out.print("adress            :");
        String address = ar.nextLine();
        }
        else
        {
            System.out.println("enter '0' or '1'");
        }
      /*  System.out.println("");
        System.out.println("Name              :"+name);
        System.out.println("Age                 :"+age);
        System.out.println("phone number        :"+phoneno);
        System.out.println("adress            :"+address);
 */ 



        
    }
}