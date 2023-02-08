class Solution {
    public int solution(int balls, int share) {
        return com(balls, share);
    }
    
    public static int com(int balls, int share){
        if(share==0 || balls==share){
            return 1;
        }
        return com((balls - 1), (share - 1)) + com(balls - 1, share);
        //3C2 = 2C2 + 2C1 (ex=3,2)
    }
}