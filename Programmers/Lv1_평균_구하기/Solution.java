class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int j = arr.length;
        int i = 0;
        int sum = 0;

        while (i < j) {
            sum += arr[i];
            i++;
        }
        answer = (double) sum / j;

        return answer;
    }
}
