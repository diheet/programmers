class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        for(int i=0; i<s1.length; i++){
            for(int j=0; j<s2.length; j++){
                if(s1[i].equals(s2[j])) //==을 쓰면 같은 객체인지 비교하고 문자열을 비교하지 않기 때문에 .equals사용해야 함
                    answer++;
            }
        }
        return answer;
    }
}