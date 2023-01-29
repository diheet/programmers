class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if(Math.sqrt(n)%1==0){ //Math.sqrt() 특정 값의 제곱근 구하기
            answer = 1;
        }else answer =2;
        return answer;
    }
}