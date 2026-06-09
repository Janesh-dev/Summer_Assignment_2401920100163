package Week_2.Day_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if (s.length() < p.length())
            return res;

        int freq1[] = new int[26];
        int freq2[] = new int[26];

        for (int i = 0; i < p.length(); i++) {
            freq1[p.charAt(i) - 'a']++;
            freq2[s.charAt(i) - 'a']++;
        }

        if (Arrays.equals(freq1, freq2))
            res.add(0);

        for (int i = p.length(); i < s.length(); i++) {
            freq2[s.charAt(i) - 'a']++;
            freq2[s.charAt(i - p.length()) - 'a']--;
            if (Arrays.equals(freq1, freq2))
                res.add(i - p.length() + 1);
        }
        return res;
    }
}
