package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID18FourSum {
    public static void main(String[] args) {
        Solution solution = new ID18FourSum().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试
//        solution.fourSum(new int[]{1, -2, -5, -4, -3, 3, 3, 5}, -11);
        //牛的你
        //整形加和溢出值  https://www.iteye.com/blog/badwing-1011709
        List<List<Integer>> lists = solution.fourSum(new int[]{1000000000, 1000000000, 1000000000, 1000000000}, -294967296);


        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> fourSum(int[] nums, int target) {
            if (nums.length < 4) {
                return Collections.emptyList();
            }
            List<List<Integer>> res = new ArrayList<>();
            //升序
            Arrays.sort(nums);


            for (int i = 0; i < nums.length; i++) {
                //直接排除答案 当 target <=0 时不成立
//                if (nums[i] > target) {
//                    continue;
//                }
                //a位置去重
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }

                for (int j = i + 1; j < nums.length; j++) {
                    int left = j + 1;
                    int right = nums.length - 1;
                    while (right > left) {
                        //加和可能溢出，用更大的类型接，且强制转换
                        long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                        if (sum > target) {
                            right--;
                        } else if (sum < target) {
                            left++;
                        } else {
                            boolean isAdd = false;
                            for (int k = 0; k < res.size(); k++) {
                                List<Integer> record = res.get(k);
                                if (nums[i] == record.get(0) && nums[j] == record.get(1) && nums[left] == record.get(2) && nums[right] == record.get(3)) {
                                    isAdd = true;
                                    break;
                                }

                            }
                            if (!isAdd) {
                                res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                            }
                            left++;

                        }
                    }

                }
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
