class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        int h = board[0]/2;
        int l = board[1]/2;
        
        for(int i=0; i<keyinput.length;i++){
            if(keyinput[i].equals("left")){
                if(answer[0] > -(h)) answer[0]--;
            }else if(keyinput[i].equals("right")){
                if(answer[0] < h) answer[0]++;
            }else if(keyinput[i].equals("up")){
                if(answer[1] < l) answer[1]++;
            }else if(keyinput[i].equals("down")){
                if(answer[1] > -(l)) answer[1]--;
            }
        }
        
        return answer;
    }
}