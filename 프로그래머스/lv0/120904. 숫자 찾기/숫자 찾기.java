class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String nums = Integer.toString(num);
        String ks = Integer.toString(k);
        
        if(nums.indexOf(ks) == -1){ //indexOf=특정 문자 위치찾기. 찾지못하면 -1 이기 때문에 조건을 -1로 해야함(?)
            answer =-1;
        } else
            answer = nums.indexOf(ks)+1; //자릿수니까 +1
        
        return answer;
    }
}