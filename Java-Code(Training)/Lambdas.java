public class Lambdas{
    public static void main(String[] args) {
        printable Lambdasprint = (() -> System.out.print("yo !"));
        System.out.println();
        printhing(Lambdasprint);
}
        
static void printhing (printable thing )
{
    thing.print();
     
 }


}









 

