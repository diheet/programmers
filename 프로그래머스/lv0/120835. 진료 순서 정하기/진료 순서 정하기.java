import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] tmp = new int[emergency.length];
        
        for(int i=0; i<emergency.length; i++) {
            tmp[i] = emergency[i];
        }
        
        Arrays.sort(tmp);
        
        for(int i=0; i<emergency.length; i++){
            for(int j=0; j<emergency.length; j++){
                if(tmp[i]==emergency[j]){
                    answer[j]=emergency.length-i;
                }
            }
        }
        
        return answer;
    }
}