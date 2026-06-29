import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        String stn = String.valueOf(n);

        for (int i = 0; i < stn.length(); i++) {
            char c = stn.charAt(i);
            answer += Character.getNumericValue(c);
        }

        return answer;
    }
}
