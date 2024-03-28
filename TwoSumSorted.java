public class TwoSumSorted {

    /**
     * Finds two numbers in the given sorted array that add up to the passed target sum.
     *
     * @param numbers an array of integers in sorted in non-descending order.
     * @param target  the target sum to find
     * @return an array containing the indices (1-based) of the two numbers if found, or null if no such pair exists.
     */
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                break;
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
        // No match was found, and we break out of the loop because left became greater than or equal to right.
        if (left >= right) {
            return null;
        }
        return new int[]{left + 1, right + 1};
    }
}
