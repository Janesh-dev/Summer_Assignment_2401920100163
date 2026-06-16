package Week_3.Day_2;

import java.util.ArrayList;

public class Solution {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> vals = new ArrayList<>();

        ListNode curr = head;
        while (curr != null) {
            vals.add(curr.val);
            curr = curr.next;
        }

        int left = 0;
        int right = vals.size() - 1;

        while (left < right) {
            if (!vals.get(left).equals(vals.get(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
