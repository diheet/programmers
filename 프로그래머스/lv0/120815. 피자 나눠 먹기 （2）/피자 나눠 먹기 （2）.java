class Solution {
    public int solution(int n) {
        int answer = 0;
        int p=6;
        
        while(p%n != 0){
            p += 6;
        }
        answer =p/6;
        
        return answer;
    }
}