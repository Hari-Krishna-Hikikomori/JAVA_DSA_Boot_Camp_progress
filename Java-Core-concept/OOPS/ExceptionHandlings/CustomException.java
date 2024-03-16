package OOPS.ExceptionHandlings;

public class CustomException
{
    private static int count = 5;
    public void divions(int a,int b) {
        try
        {
             divionscheck(a,b);
        }catch (Exception e)
        {
            System.out.println(a+" is not (Dived) "+e.getMessage());
        }finally {
            System.out.println("Arithmetic........checking is done");
            System.out.println();
        }
    }

    private int divionscheck(int a, int b)
    {
        return a / b;
    }

    public void Password(String wrd)
    {

        try {
            System.out.println(PasswordExp(wrd));
        }catch (Exception e)
        {
            System.out.println("Incorrect Password");
            System.out.println(--count+" Attempt available");
        }
    }

    private String PasswordExp(String wrd)
    {
        if(!wrd.equals("P@ssw0rd"))
        {
            throw new SecurityException();
        }else return "Welcome";
    }

}
