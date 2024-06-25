package leetcode.editor.cn;

import java.lang.reflect.Array;
import java.util.*;

import leetcode.editor.util.*;
import sun.security.util.ArrayUtil;

public class ID15ThreeSum {
    public static void main(String[] args) {
        Solution solution = new ID15ThreeSum().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试
//        solution.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
//        solution.threeSum(new int[]{0, 0, 0, 0});
        solution.threeSum(new int[]{-1, 0, 1, 2, -1, -4, -2, -3, 3, 0, 4});
        System.out.println(sb);
    }

    //解答成功:
//	执行耗时:1696 ms,击败了5.00% 的Java用户
//	内存消耗:50.3 MB,击败了59.66% 的Java用户

    class SolutionMy {
        public List<List<Integer>> threeSum(int[] nums) {
            if (nums.length < 3) {
                return new ArrayList<>();
            }
            List<List<Integer>> res = new ArrayList<>();

            HashMap<Integer, HashMap<Integer, Integer>> records = new HashMap<>();
            //排序
            Arrays.sort(nums);

            for (int i = 0; i < nums.length; i++) {
                int left = i + 1;
                int right = nums.length - 1;

                while (right > left) {
                    if (nums[i] + nums[left] + nums[right] == 0) {
                        boolean isContain = false;
                        for (int j = 0; j < res.size(); j++) {
                            List<Integer> record = res.get(j);
                            if (record.get(0) == nums[i] && record.get(1) == nums[left] && record.get(2) == nums[right]) {
                                isContain = true;
                                break;
                            }
                        }
                        if (!isContain) {
                            res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        }
                        //要移动，继续寻找
                        left++;
                    } else if (nums[i] + nums[left] + nums[right] > 0) {
                        right--;
                    } else if (nums[i] + nums[left] + nums[right] < 0) {
                        left++;
                    }
                }
            }

            return res;
        }
    }

    //leetcode submit region begin(Prohibit modification and deletion)

    //去重很妙！

    //    解答成功:
//    执行耗时:27 ms,击败了94.67% 的Java用户
//    内存消耗:50.2 MB,击败了80.44% 的Java用户
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            Arrays.sort(nums);
            // 找出a + b + c = 0
            // a = nums[i], b = nums[left], c = nums[right]
            for (int i = 0; i < nums.length; i++) {
                // 排序之后如果第一个元素已经大于零，那么无论如何组合都不可能凑成三元组，直接返回结果就可以了
                if (nums[i] > 0) {
                    return result;
                }

                if (i > 0 && nums[i] == nums[i - 1]) {  // 去重a
                    continue;
                }

                int left = i + 1;
                int right = nums.length - 1;
                while (right > left) {
                    int sum = nums[i] + nums[left] + nums[right];
                    if (sum > 0) {
                        right--;
                    } else if (sum < 0) {
                        left++;
                    } else {
                        result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        // 去重逻辑应该放在找到一个三元组之后，对b 和 c去重
                        while (right > left && nums[right] == nums[right - 1]) right--;
                        while (right > left && nums[left] == nums[left + 1]) left++;

                        right--;
                        left++;
                    }
                }
            }
            return result;
        }
    }


//leetcode submit region end(Prohibit modification and deletion)

}
