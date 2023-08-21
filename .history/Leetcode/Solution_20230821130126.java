import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        temp.add(nums[0]);
        int c = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > temp.get(temp.size() - 1)) {
                temp.add(nums[i]);
                c++;
            } else {
                int index =  Collections.binarySearch(temp, nums[i]);
                S.o
                //temp.set(index, nums[i]);
            }
        }
        return c + 1;
    }
  
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(solution.lengthOfLIS(nums)); // Output: 4
    }
}