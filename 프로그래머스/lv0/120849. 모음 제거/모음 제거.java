class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] m = {"a","e","i","o","u"};
        for(int i = 0; i < m.length; i++){
           if(my_string.contains(m[i])){
               answer = my_string.replaceAll(m[i],"");
               my_string = answer;
           }else
               answer = my_string;
        }
        return answer;
    }
}