class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        //Ingeger.parseInt(문자열, int 진수) 진수인 문자열 값을 10진수 int타입으로 반환해줌
        int b1 = Integer.parseInt(bin1, 2); //2진수니까 2넣어줌
        int b2 = Integer.parseInt(bin2, 2);
        int res = b1+b2;
        
        answer = Integer.toBinaryString(res); //toBinaryString() 10진수 -> 2진수로 바꾸어 String타입으로 반환해줌
        return answer;
    }
}