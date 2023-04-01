class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String number = my_string.replaceAll("[^0-9]","");
        char[] cNum = number.toCharArray();
        
        for(int i = 0; i < cNum.length; i++){
            answer += cNum[i] - '0';
        }
        return answer;
    }
}