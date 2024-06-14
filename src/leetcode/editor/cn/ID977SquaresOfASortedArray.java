package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

//【注意】返回数字，因此不需要在原数组上调整
public class ID977SquaresOfASortedArray {
    public static void main(String[] args) {
        Solution solution = new ID977SquaresOfASortedArray().new Solution();
        StringBuilder sb = new StringBuilder();
        solution.sortedSquares(new int[]{-4, -1, 0, 3, 10});
        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] sortedSquares(int[] nums) {
            if (nums == null) {
                return nums;
            }
            int left = 0;
            int right = nums.length - 1;
            int index = nums.length - 1;
            int[] res = new int[nums.length];
            while (index >= 0 ) {
                if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                    res[index] = nums[left] * nums[left];
                    left++;
                } else {
                    res[index] = nums[right] * nums[right];
                    right--;
                }
                index--;
            }
//            for (int i = 0; i < res.length; i++) {
//                nums[res.length - 1 - i] = res[i];
//            }
//            return nums;

			return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
