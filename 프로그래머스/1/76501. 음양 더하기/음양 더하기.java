class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i = 0; i < signs.length; i++){
            int bool = 0;
            if(signs[i] == true){
                bool = 1;
            }else{
                bool = -1;
            }
            answer += absolutes[i] * bool;
        }
        return answer;
    }
}