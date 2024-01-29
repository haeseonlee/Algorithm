class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String a1 = String.valueOf(a);
        String b1 = String.valueOf(b);

        int answer1 = Integer.parseInt(a1 + b1);
        int answer2 = Integer.parseInt(b1 + a1);
        if(answer1 > answer2){
            answer = answer1;
        }else{
            answer = answer2;
        }
        return answer;
    }
}