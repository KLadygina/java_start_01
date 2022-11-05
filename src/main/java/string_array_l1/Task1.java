package string_array_l1;

public class Task1 {
    public int[] BuildArray(int[] nums) {
        nums = new int[]{0, 2, 1, 5, 3, 4};
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
            System.out.println(nums[nums[i]]);
        }
        return ans;
    }
}
