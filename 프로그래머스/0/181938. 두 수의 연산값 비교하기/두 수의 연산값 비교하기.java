class Solution {
    public int solution(int a, int b) {
        String str1 = String.valueOf(a);
        String str2 = String.valueOf(b);
        int answer1 = Integer.parseInt(str1 + str2);
        int answer2 = 2 * a * b;
        
        return Math.max(answer1,answer2);
    }
}