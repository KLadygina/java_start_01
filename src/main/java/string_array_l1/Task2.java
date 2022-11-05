package string_array_l1;

public class Task2 {
    public int removeElement(int[] nums, int val) {
        int saveIndex = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val){
                nums[saveIndex] = nums[i];
                saveIndex++;
            }
        }
        return saveIndex;
    }

}
