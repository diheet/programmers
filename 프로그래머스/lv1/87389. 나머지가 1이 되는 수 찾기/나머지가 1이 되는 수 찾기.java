class Solution {
    public int solution(int n) {
        int answer = 0;
        int i=0;
        
        if(n<=3){
            return n;
        }
        for(i=1;i<=n;i++){
            if(n%i == 1){
                return i;
            }}
        
        return answer;
    }
}