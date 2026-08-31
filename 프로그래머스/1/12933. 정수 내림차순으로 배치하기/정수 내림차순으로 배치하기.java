import java.util.*;

class Solution {
    public long solution(long n) {
//         String[] nums = String.valueOf(n).split("");
        
//         Arrays.sort(nums, Collections.reverseOrder());
        
//         StringBuilder sb = new StringBuilder();
//         for(int i = 0; i < nums.length; i++){
//             sb.append(nums[i]);
//         }
       
//         return Long.parseLong(sb.toString());
        List<Long> list = new ArrayList<>();
        while(n > 0){
            list.add(n % 10);
             n /=10;
        }
        Collections.sort(list, Collections.reverseOrder());
        long answer = 0;
        for (int i = 0; i < list.size(); i++){
            answer += list.get(i) * Math.pow(10, list.size() - i - 1);
        }
        return answer;
    }
}