package OOPS.ObjectCloning;

public class Test
{
    public static void main(String[] args) throws CloneNotSupportedException {
        Student krish = new Student(23,"Krishnan");
        krish.setMark(57);
        krish.setMark(58);
        krish.setMark(37);
        krish.setMark(39);
        krish.setMark(79);

        Student rossi = (Student)krish.clone();
        rossi.setMark(5,100);


        krish.setName("rossi");
        rossi.getDetail();
        System.out.println();
        krish.getDetail();
    }
}
