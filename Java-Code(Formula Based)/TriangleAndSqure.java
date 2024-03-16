package Assignment;

public class TriangleAndSqure 
{
    public static void main(String[] args) {
        
    
    int l = 7 ;
    int w = 5 ;
    Areatriangle(l,w);
    Areasq(l,w);
    lengthrectangle(l,w);
    perimeterrectangle(l,w);
    DiagnalRectangle(l,w);


    
    
    }
  private static void DiagnalRectangle(int l, int w) 
    {
      double  diagnal = w * w + l * l;
      diagnal = Math.sqrt(diagnal) ;
      System.out.println(diagnal);
    }
  private static void perimeterrectangle(int l, int w) 
    {
      int perimete = 2 * (l+w);
      System.out.println(perimete);   
    }
private static void lengthrectangle(int l, int w) 
  {
      int leng = l/ w;
      System.out.println(leng); 
  }
  public static void Areasq(int l, int w) 
  {
    
    int AreaOfSq  = l * w ;
    System.out.println(AreaOfSq);
  }
  public static void Areatriangle(int l , int w)
 {
    int Areaoftri =(l * w)/2;
    System.out.println(Areaoftri);
 }

}
