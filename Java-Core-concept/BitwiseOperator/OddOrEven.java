package BitwiseOperator;

public class OddOrEven {
public static void main(String[] args) {
     int value = 50;
     FindOddOrEven(value);
}

static void FindOddOrEven(int value) 
{
    if((value & 1) == 1 ) System.out.println(value+" - Odd number");
    else System.out.println(value+" - Even number");
}
    
}