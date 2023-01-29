class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while(n>0){
            answer += n%10;
            n /= 10;
        } //나 while문 모르네
        return answer;
    }
}