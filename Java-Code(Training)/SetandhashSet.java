import java.util.HashSet;
import java.util.Set;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
    int left = 0, right = 0, maxLen = 0;
    Set<Character> set = new HashSet<>();
    while (right < n) {
        if (!set.contains(s.charAt(right))) {
            set.add(s.charAt(right));
            right++;
            maxLen = Math.max(maxLen, right - left);
        } else {
            set.remove(s.charAt(left));
            left++;
        }
    }
    return maxLen;

        
    }
}

public class SetandhashSet{

    public static void main(String []args)
    {
        
        


    }
}


