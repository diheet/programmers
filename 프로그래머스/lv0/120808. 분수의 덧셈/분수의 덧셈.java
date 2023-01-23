class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int mo = denom1*denom2;
        int ja = numer1*denom2+denom1*numer2;
        int max = 1;
        
        for(int i=1; i<=mo&&i<=ja; i++){ //최대 공약수
            if(mo%i==0 && ja%i==0){
                max = i;
            }
        }
        
        answer[0] = ja/max;
        answer[1] = mo/max;
        return answer;
    }
}