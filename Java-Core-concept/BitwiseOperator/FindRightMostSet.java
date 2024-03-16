package BitwiseOperator;


public class FindRightMostSet {
        public static void main(String[] args) {
         int n = 20;
         n = ~n +1;
         System.out.println(n);  
         right(16);
         Kunal_RightMostShift(16);
        }
        static void Kunal_RightMostShift(int n)
        {
            System.out.println(n);
            n = (~n + 1) & n;
            int b = 1;
            while ((n >>= 1)>0) {

                b++;
            }
            System.out.println("Position "+b);
        }    
        private static void right(int i) 
        {
            int a = 0;
            int b = 0;
             while (b == 0) {
                
                int c = 1 << a;
                b = i & c;
                if(b != 0) 
                {
                    a = a+1;
                    System.out.println("the position of most set in right "+ a );
                    
                } 
                a = a+1;   
             }
            }
        }          
    
    
