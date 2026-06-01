import java.util.HashMap;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        // Sample test case
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        int[] result = findTwoSum(nums, target);
        System.out.println("Indices: " + Arrays.toString(result));
    }

    public static int[] findTwoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int requiredNum = target - nums[i];

            // If we found the required number, return both indices
            if (map.containsKey(requiredNum)) {
                return new int[] { map.get(requiredNum), i };
            }

            // Otherwise, add the current number and its index to the map
            map.put(nums[i], i);
        }

        return new int[] {}; // Return empty if no solution exists
    }
}