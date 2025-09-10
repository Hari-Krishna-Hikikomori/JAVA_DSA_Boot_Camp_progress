package HEAPs;

public class Test_heap
{
    public static void main(String[] args) {

        mapUsinghash test = new mapUsinghash();

        test.put("hari","yogi");
        System.out.println(test.get("hari"));
        test.remove("hari");
        test.get("hari");
    }
}
