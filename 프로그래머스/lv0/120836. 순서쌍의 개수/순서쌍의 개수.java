class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // for(int i=0;i<=n;i++){
        //     for(int j=n;j>0;j--){
        //         if(i*j==n){
        //             answer++;
        //         }
        //     }
        // } ->시간초과모과사과한과
        
        for(int i=1;i<=n;i++){
            if(n%i==0){
                answer++;
            }
        }
        return answer;
    }
}