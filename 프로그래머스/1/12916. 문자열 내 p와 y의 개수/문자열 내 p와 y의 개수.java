import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();
        System.out.print(s);
        int p = 0;
        int y = 0;
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(arr[i]=='p'){
                p += 1;
            }else if(arr[i]=='y'){
                y += 1;
            }else{
                continue;
            }
        }

        return p==y ? true:false;
    }
}