class Solution {
    public String solution(String[] seoul) {
        int where = 0;
        for(int i = 0; i< seoul.length; i++){
            if(seoul[i].equals("Kim")){
                where = i;
            }
        }
        String answer = "김서방은 " + where+"에 있다";
        return answer;
    }
}