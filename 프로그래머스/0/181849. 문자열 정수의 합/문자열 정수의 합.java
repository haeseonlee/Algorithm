class Solution {
    public int solution(String num_str) {
        int answer = 0;
        int[] list = new int[num_str.length()];
        for(int i = 0; i < num_str.length(); i++){
            list[i] = num_str.charAt(i) - '0';
            answer += list[i];
        }
        return answer;
    }
}