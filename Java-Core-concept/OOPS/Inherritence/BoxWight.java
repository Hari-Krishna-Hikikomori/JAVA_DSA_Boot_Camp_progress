package OOPS.Inherritence;

public class BoxWight extends Boxs
{
    public double Weight;

    public BoxWight()
    {
        Weight = 0.0;
    }

    public BoxWight(double length, double height, double width, double Weight)
    {
        super(length, height, width);
        Weight = Weight;
    }
    public BoxWight(double size, double Weight)
    {
        super(size);
        this.Weight = Weight;
    }

    public BoxWight (BoxWight other)
    {
         this.width = other.width;
         this.length = other.length;
         this.height = other.height;
         this.Weight = other.Weight;
    }
    public BoxWight(double Weight)
    {
        this.Weight = Weight;
    }


    public void Display()
    {
        System.out.println("Weight - "+this.Weight+" K.G");
    }
    public void  DisplayAll()
    {
        super.display();
        Display();
    }
    public Boxs CopyofSize(Boxs others)
    {
        this.width  = others.width;
        this.length = others.length;
        this.height = others.height;

        return others;
    }


}
