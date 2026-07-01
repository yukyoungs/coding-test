import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        char[] arr = String.valueOf(n).toCharArray();

        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            char c = arr[left];
            arr[left] = arr[right];
            arr[right] = c;
            left++;
            right--;
        }

        String str = new String(arr);
        answer = Long.parseLong(str);

        return answer;
    }
}
