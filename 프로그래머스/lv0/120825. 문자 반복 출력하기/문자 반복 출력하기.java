class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char[] ms = my_string.toCharArray();
        
        for(int i=0; i<ms.length;i++){
            for(int j=0;j<n;j++){
                answer += ms[i];
            }
        }
        return answer;
    }
}