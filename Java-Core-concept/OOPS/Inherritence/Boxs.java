package OOPS.Inherritence;

public class Boxs 
{
    public double length;
    public double height;
    public double width;

   public void display()
   {
       System.out.println("length - "+length+".inch");
       System.out.println("height - "+height+".inch");
       System.out.println("width  - "+width+".inch");
   }
   public Boxs()
   {
       length = 0.0;
       height = 0.0;
       width = 0.0;
   }

    public Boxs(double same) 
    {
        length = same;
        height = same;
        width  = same;
    }

    public Boxs(double length, double height, double width)
    {
        this.length = length;
        this.height = height;
        this.width = width;
    }
    public Boxs (Boxs other)
    {
        this.width  = other.width;
        this.length = other.length;
        this.height = other.height;
    }


}
