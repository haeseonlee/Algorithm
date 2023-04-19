import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> arrList = new ArrayList<>();
        int n = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != n){
                arrList.add(arr[i]);
                n = arr[i];
            }
        }
        answer = new int[arrList.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = arrList.get(i);
        }
        return answer;
    }
}