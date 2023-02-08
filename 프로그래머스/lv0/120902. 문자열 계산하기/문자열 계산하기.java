class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] ms = my_string.split(" ");
        
                    answer = Integer.parseInt(ms[0]);

        for(int i=1;i<ms.length;i+=2){
            if(ms[i].equals("+")){
                answer += Integer.parseInt(ms[i+1]);
            }else{
                answer -= Integer.parseInt(ms[i+1]);
            }
        }
        return answer;
    }
}