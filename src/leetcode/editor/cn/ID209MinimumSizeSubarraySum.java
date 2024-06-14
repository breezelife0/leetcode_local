package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID209MinimumSizeSubarraySum {
    public static void main(String[] args) {
        Solution solution = new ID209MinimumSizeSubarraySum().new Solution();
        StringBuilder sb = new StringBuilder();
        solution.minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3});
        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int minSubArrayLen(int target, int[] nums) {
            if (nums == null || nums.length == 0) {
                return 0;
            }
            //初始值最小值，设置成整形最大，非常巧妙！！！
            int minLen = Integer.MAX_VALUE;
//            minLen = minLen == 0 ? (R - L + 1) : Math.min(R - L + 1, minLen);
            int L = 0;
            int R = 0;
            int sum = 0;
            while (R < nums.length) {
                sum += nums[R];
                //关键
                while (sum >= target) {
                    minLen = Math.min(minLen, R - L + 1); //注意长度是坐标差+1
                    sum -= nums[L];
                    L++;
                }

                R++;
            }

            //注意还原最小值！
            return minLen == Integer.MAX_VALUE ? 0 : minLen;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
