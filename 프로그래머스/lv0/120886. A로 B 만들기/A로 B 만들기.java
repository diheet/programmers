import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        char[] beforeArr = before.toCharArray();
        char[] afterArr = after.toCharArray();
        
        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);
        
        String b = new String(beforeArr);
        String a = new String(afterArr);
        
        if(b.equals(a)) {
            answer = 1;
        }else{
            answer = 0;
        }
        return answer;
    }
}