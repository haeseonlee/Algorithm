import java.util.*;
class Solution {
    public String solution(String s) {
        String[] charArr = s.split("");
        Arrays.sort(charArr, Collections.reverseOrder());
        return String.join("",charArr);
    }
}