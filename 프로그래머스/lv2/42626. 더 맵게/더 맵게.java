import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> myQueue = new PriorityQueue<>();
        for(int i = 0; i < scoville.length; i++){
            myQueue.add(scoville[i]);
        }
        int count = 0;
        while(myQueue.peek() < K){
            if(myQueue.size() < 2) return -1;
            
            int result1 = myQueue.poll();
            int result2 = myQueue.poll();
            int result = result1 + (result2 * 2);
            myQueue.add(result);
            count++;
        }
        return count;
    }
    
}