import java.util.Arrays;

/**
 * Created by xiongjian on 2018/9/30.
 */
public class TwoSum {
    /**
     给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
     你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。

     示例:
     给定 nums = [2, 7, 11, 15], target = 9
     因为 nums[0] + nums[1] = 2 + 7 = 9
     所以返回 [0, 1]
     */


    public static void main(String[] args){
       Solution solution = new Solution();
       int[] nums = {3,2,3};
       int target = 6;
       System.out.println(Arrays.toString(solution.twoSum(nums, target)));

    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i=0; i<nums.length ; i++){
            for (int j=i+1; j<nums.length; j++){
                if (target == nums[i] + nums[j]) {
                    int[] result = {i, j};
                    return result;
                }
            }
        }
        return null;
    }
}