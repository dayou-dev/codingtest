class Solution {
    public String solution(int n) {
        String answer = "";
        String a = "수박";
        String b= "수";
        for(int i = 0; i < (n/2); i++){
            answer += a;
        }
        if(n % 2 != 0){
            answer += b;
        }
        return answer;
    }
}