class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int in = 0;
        int num = 0;
        
        for(int i=0;i<array.length;i++){
            if(array[i] > num){
                num = array[i];
                in = i;
            }
        }
        
        answer[0] = num;
        answer[1] = in;
        
        return answer;
    }
}