class Solution {
    public String solution(String rsp) {
        String answer = "";
        String[] r = rsp.split("");
        
        for(int i=0; i<r.length;i++){
            if(r[i].equals("2")){
                answer += 0;
            }else if(r[i].equals("0")){
                answer += 5;
            }else if(r[i].equals("5")){
                answer += 2;
            }
        }
        return answer;
    }
}