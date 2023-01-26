class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i = my_string.length() -1; i>=0; i--){ //왜 -1 하는건지 모르겠다 ㅎㅎ
            answer+=my_string.substring(i,i+1); //시작점 i 부터 끝점i+1까지
        }
        return answer;
    }
}