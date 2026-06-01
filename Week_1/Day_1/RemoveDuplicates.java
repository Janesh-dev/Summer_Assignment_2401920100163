public class RemoveDuplicates {
    public static void main(String[] args) {
        // Sample test case
        int[] nums = { 1, 1, 2, 2, 3 };

        int newLength = removeDuplicates(nums);

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 1; // Points to where the next unique element should go

        for (int i = 1; i < nums.length; i++) {
            // If the current element is different from the previous one, it's unique
            if (nums[i] != nums[i - 1]) {
                nums[uniqueIndex] = nums[i];
                uniqueIndex++;
            }
        }

        return uniqueIndex;
    }
}