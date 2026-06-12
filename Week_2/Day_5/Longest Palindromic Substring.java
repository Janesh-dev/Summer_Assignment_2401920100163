package Week_2.Day_5;

class Solution {
    public String longestPalindrome(String s) {
        int start = 0, maxLen = 1;

        for (int i = 0; i < s.length(); i++) {

            int len1 = expand(s, i, i);

            int len2 = expand(s, i, i + 1);

            int best = Math.max(len1, len2);

            if (best > maxLen) {
                maxLen = best;
                start = i - (best - 1) / 2;
            }
        }

        return s.substring(start, start + maxLen);
    }

    private int expand(String s, int left, int right) {
        while (left >= 0 && right < s.length()
                && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;
    }
}
