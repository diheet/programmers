class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1;i<=n;i++){
            int cnt =0; //각 수마다 초기화 해줘야함
            
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    cnt += 1;
                }else
                    cnt += 0;
            }
            
            if(cnt>=3){
                answer += 1;
            }else
                answer += 0;
        }
        return answer;
    }
}