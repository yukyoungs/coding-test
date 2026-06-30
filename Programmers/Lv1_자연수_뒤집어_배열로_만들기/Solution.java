class Solution {
    public int[] solution(long n) {
        String stn = String.valueOf(n);
        int[] answer = new int[stn.length()];

        int i = stn.length() - 1;
        int j = 0;

        while (i >= 0) {
            answer[j] = Character.getNumericValue(stn.charAt(i));
            i--;
            j++;
        }

        return answer;
    }
}
