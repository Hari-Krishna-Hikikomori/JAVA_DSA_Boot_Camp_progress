package Maths;

public class Newton_Sqrt {
    public static void main(String[] args) {
        int num = 40;
        System.out.println(sqrt(num));
    }

    private static double sqrt(int i) 
    { 
        double  n = i; 
        double root = 0.0;
        while (true) 
        {
               // (0.5 * (x) ) == ((x)/2) both are same
            root = 0.5 * (n+(i/n));
            
            if(Math.abs(root-n) < 0.0000001)
            {
                
                return root;
            }
            n = root;
        }
    }
}
