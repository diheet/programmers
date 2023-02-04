class Solution {
    public int solution(int order) {
        int answer = 0;
        int temp = 0;
        
        while(order>0){
            temp = order%10;
            
            if(temp == 3 || temp == 6 || temp ==9){
                answer += 1;
            }
            
            order /= 10;
        }
        return answer;
    }
}