class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {0,0};
        int a=0;
        int b=0;
        
        for(int i=0; i<num_list.length; i++){
            if(num_list[i]%2==0){
                a += 1;
            }else if(num_list[i]%2==1){
                b += 1;
            }else
                b += i;
        }
        
        answer[0] = a;
        answer[1] = b;
        
        return answer;
    }
}