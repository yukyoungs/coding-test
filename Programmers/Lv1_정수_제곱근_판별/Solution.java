class Solution {
    public long solution(long n) {
        long answer = 0;

        double result = Math.sqrt(n);

        if ((long) result * (long) result == n) {
            long result2 = (long) result + 1;
            answer = result2 * result2;
        } else {
            answer = -1;
        }

        return answer;
    }
}
