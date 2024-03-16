package BitwiseOperator;

public class LeftShift 
{
 public static void main(String[] args) {
    int num = 9;
    Shift(1,num);
 }

static void Shift(int i, int num) {
    // int b = 5;
    // System.out.println(Integer.toBinaryString((1 << 4)-1));
    // System.out.println(5);
    int shift = (1 << num-1)-1 ^ (1 << i-1) ;

    System.out.println(shift & num);
}   
}
