class Solution {
    public int solution(int[] sides) { //3,6
        int answer = 0;
        int b = Math.max(sides[0], sides[1]); //6
        int s = Math.min(sides[0], sides[1]); //3
        
        int ss = b-s; //3=6-3
        int bb = b+s; //9=6+3
        
        answer = bb-ss-1; //5=9-3-1
        return answer;
    }
}