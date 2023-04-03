class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] array = my_string.toCharArray();
        
        String tmp = "";
        for(int i = 0; i < array.length; i++){
            if(array[i] >= 65 && array[i] <= 90){
                tmp = array[i] + "";
                answer += tmp.toLowerCase();
            } else if(array[i] >= 97 && array[i] <= 122){
                tmp = array[i] + "";
                answer += tmp.toUpperCase();
            }
        }
        return answer;
    }
}