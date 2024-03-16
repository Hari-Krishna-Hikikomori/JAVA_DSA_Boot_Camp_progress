package OOPS.Inherritence;

public class BoxPrice extends BoxWight
{
    public double price;
    public double price()
    {
       price = Weight * 10;
       return price;
    }
    public BoxPrice()
    {

        price = Weight * 10;
    }

    public BoxPrice(double length, double height, double width, double Weight,double price)
    {
        super(length, height, width,Weight);
        this.price = price;
    }
    public BoxPrice(double size, double Weight, double price)
    {
        super(size,Weight);
        this.price = price;
    }
    public BoxPrice(double size, double Weight)
    {
        super(size,Weight);
        this.Weight = Weight;
        price = Weight * 10;
    }

    public BoxPrice (BoxPrice other)
    {
        this.width  = other.width;
        this.length = other.length;
        this.height = other.height;
        this.Weight = other.Weight;
        this.price  = other.price ;
    }
    public BoxPrice(double price)
    {
        this.price = price;
    }
    public void display()
    {
        System.out.println("Price -  "+this.price+" rs");
    }

    public void DisplayAll()
    {
        super.DisplayAll();
        display();
    }

    public BoxWight CopyofWeight(BoxWight others)
    {
        this.Weight = others.Weight;
        return others;
    }
    public BoxWight CopyofWeight_size(BoxWight others)
    {
        this.width  = others.width;
        this.length = others.length;
        this.height = others.height;
        this.Weight = others.Weight;
        return others;
    }



}
