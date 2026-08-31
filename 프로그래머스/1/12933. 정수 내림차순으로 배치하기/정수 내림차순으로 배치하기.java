import java.util.*;

class Solution {
    public long solution(long n) {
        String[] nums = String.valueOf(n).split("");
        
        Arrays.sort(nums, Collections.reverseOrder());
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < nums.length; i++){
            sb.append(nums[i]);
        }
       
        return Long.parseLong(sb.toString());
    }
}