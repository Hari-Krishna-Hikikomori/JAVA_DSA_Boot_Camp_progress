package JAVA.Recursion_Subset_Subsequence_String_Qurestion;

public class removeTheChar_String {
    public static void main(String[] args) {
        String word = "baccad";
        char find = 'a';
        String ans = new String();

        System.out.println(Nremovewrd(word,find));
        System.out.println(Apple("styapplehh","apple"));
        System.out.println("styapplehh".replaceFirst("apple",""));
        removewrd(word,ans,find);
    }

    private static void removewrd(String word,String ans,char find) {
        if(word.isEmpty())
        {
            System.out.println(ans);
            return;
        }
        if(find == word.trim().charAt(0))
        {
            removewrd(word.substring(1), ans, find);
            return;
        }
        ans = ans + word.charAt(0);
        removewrd(word.substring(1), ans, find);
    }
    private static String Nremovewrd(String word,char find) {
        if(word.isEmpty())
        {
            return "";
        }
        if(find == word.charAt(0))
        {
            word = Nremovewrd(word.substring(1),find);
            return word;
        }
        word = word.charAt(0) + Nremovewrd(word.substring(1), find);
        return word;
    }
    private static String Apple(String word,String find) {
        if(word.isEmpty())
        {
            return "";
        }
        if(word.startsWith(find))
        {
            word = Apple(word.substring(find.length()),find);
            return word;
        }
        word = word.charAt(0) + Apple(word.substring(1), find);
        return word;
    }
}
