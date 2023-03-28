import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int max = sides[0];
        Arrays.sort(sides);
        for(int i = 0; i < sides.length; i++){
            if(max < sides[i])
                max = sides[i];
        }
        if(sides[0] + sides[1] > max)
                return 1;
        else
                return 2;
    }
}