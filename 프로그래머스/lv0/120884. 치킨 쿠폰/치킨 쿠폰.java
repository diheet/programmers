class Solution {
    public int solution(int chicken) {
        int cupon = 10;
        int answer = 0;
        
        while (chicken >= cupon){
            int order_chicken = chicken/10;
            int rest_chicken = chicken%10;
            answer += order_chicken;
            
            chicken = rest_chicken + order_chicken;
        }
        return answer;
    }
}