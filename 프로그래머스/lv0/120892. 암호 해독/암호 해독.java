class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        String[] c = cipher.split("");
        
        for(int i=0; i<c.length;i++){
            if((i+1)%code == 0){
                answer += c[i];
            }
        }
        return answer;
    }
}