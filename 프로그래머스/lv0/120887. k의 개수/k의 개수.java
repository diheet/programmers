class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String sk = String.valueOf(k); //문자열로 바꿔주기
        
        for(int z=i; z<=j; z++){
            String sz = String.valueOf(z); //문자열로 바꿔주기
            
            if(sz.contains(sk)){ //같은값 존재 확인
                String[] arr = sz.split(""); //다 쪼개..
                
                for(String s : arr) {
                    if(s.equals(sk)){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}