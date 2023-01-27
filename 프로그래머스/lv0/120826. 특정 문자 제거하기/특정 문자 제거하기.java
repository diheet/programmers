class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        
        answer = my_string.replace(letter,"");  //deleteCharAt()도 있다고 함
        
        return answer;
    }
}