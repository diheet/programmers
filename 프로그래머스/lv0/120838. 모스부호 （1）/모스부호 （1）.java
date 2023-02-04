class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morseList = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] letterList;
        
        letterList = letter.split(" ");
        
        for(String s : letterList){
            for(int i = 0; i<morseList.length; i++){
                if(s.equals(morseList[i])){
                    answer += Character.toString(i+'a'); //a+0=a,a+1=b...
                }
            }
        }
        return answer;
    }
}