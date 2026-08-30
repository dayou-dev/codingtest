class Solution {
    public int[] solution(long n) {
        String[] len = Long.toString(n).split("");
        int[] answer = new int[len.length];
        for (int i = 0; i < answer.length; i++){
            answer[i] = Integer.parseInt(len[len.length-1-i]);
        }
        return answer;
    }
}