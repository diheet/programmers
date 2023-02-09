class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] ms = my_string.replaceAll("[^0-9]"," ").split(" ");
        
        for(int i=0; i<ms.length; i++){
            if(ms[i].equals("")){
                continue;
            }else {
                answer += Integer.parseInt(ms[i].trim()); //trim()문자열 공백 제거
            }
        }
        return answer;
    }
}