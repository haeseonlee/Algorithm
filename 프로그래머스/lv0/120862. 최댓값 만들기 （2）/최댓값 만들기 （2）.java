import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int res1 = numbers[0] * numbers[1];
        int res2 = numbers[numbers.length -1] * numbers[numbers.length -2];
        if(res1 < res2){
            return res2;
        } else
            return res1;
    }
}