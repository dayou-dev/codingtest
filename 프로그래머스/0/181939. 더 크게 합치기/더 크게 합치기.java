class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String A = String.valueOf(a) + String.valueOf(b);
        String B = String.valueOf(b) + String.valueOf(a);
        return answer = Integer.valueOf(A) > Integer.valueOf(B) ? Integer.valueOf(A) : Integer.valueOf(B);
    }
}