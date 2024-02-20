class Solution {
    public int solution(int[] num_list) {
        int mul = 1;
        int sum = 0;
        int answer = 0;
        for(int num : num_list){
            if(num_list.length >= 11){
                sum += num;
                answer = sum;
            }else{
                mul *= num;
                answer = mul;
            }
        }
        return answer;
    }
}