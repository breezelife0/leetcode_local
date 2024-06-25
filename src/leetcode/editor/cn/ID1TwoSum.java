package leetcode.editor.cn;

import java.util.*;

import jdk.nashorn.internal.ir.IfNode;
import leetcode.editor.util.*;

public class ID1TwoSum {
    public static void main(String[] args) {
        Solution solution = new ID1TwoSum().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试
        solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(sb);
    }

    class Solution1 {
        public int[] twoSum(int[] nums, int target) {
            if (nums == null || nums.length < 2) {
                return new int[]{-1, -1};
            }
            HashSet<Integer> records = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                //缓存思想
                if (records.contains(nums[i])) {
                    continue;
                }
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
                records.add(nums[i]);
            }
            return new int[]{-1, -1};
        }
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] twoSum(int[] nums, int target) {

            if (nums == null || nums.length < 2) {
                return new int[2];
            }
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                //妙的很
                int search = target - nums[i];
                if (map.keySet().contains(search)) {
                    return new int[]{i, map.get(search)};
                }
                map.put(nums[i], i);
            }
            return new int[2];
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}
