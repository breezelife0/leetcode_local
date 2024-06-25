package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID454FourSumIi {
    public static void main(String[] args) {
        Solution solution = new ID454FourSumIi().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试
        //(0, 0, 0, 1)   (1, 1, 0, 0)
        solution.fourSumCount(new int[]{1, 2}, new int[]{-2, -1}, new int[]{-1, 2}, new int[]{0, 2});
        System.out.println(sb);
    }

//关键：只记录个数

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
            if (nums1 == null || nums2 == null || nums3 == null || nums4 == null) {
                return 0;
            }
            int res = 0;
            //1 2 之和的个数
            HashMap<Integer, Integer> sumMap = new HashMap<>();
            for (int i = 0; i < nums1.length; i++) {
                for (int j = 0; j < nums2.length; j++) {
                    int sum = nums1[i] + nums2[j];
                    sumMap.put(sum, sumMap.getOrDefault(sum, 0) + 1);
                }
            }
            for (int i = 0; i < nums3.length; i++) {
                for (int j = 0; j < nums4.length; j++) {
                    int remain = 0 - nums3[i] - nums4[j];
                    res += sumMap.getOrDefault(remain, 0);
                }
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
