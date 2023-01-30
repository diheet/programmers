class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;

        if(str1.contains(str2)){ //contains() 문자안에 포함하는지 boolean 값으로 return
            answer = 1;
        }else answer =2;
        
        return answer;
    }
}