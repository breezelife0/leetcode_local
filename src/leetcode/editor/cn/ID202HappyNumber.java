package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID202HappyNumber {
    public static void main(String[] args) {
        Solution solution = new ID202HappyNumber().new Solution();
        StringBuilder sb = new StringBuilder();
//        solution.isHappy(19);
        solution.isHappy(123);

        //执行测试

        System.out.println(sb);
    }
//题目中说了会 无限循环，那么也就是说求和的过程中，sum会重复出现，这对解题很重要！
//正如：关于哈希表，你该了解这些！ (opens new window)中所说，当我们遇到了要快速判断一个元素是否出现集合里的时候，就要考虑哈希法了。

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isHappy(int n) {
            Set<Integer> record = new HashSet<>();
            while (n != 1 && !record.contains(n)) {
                record.add(n);
                n = getNextNumber(n);
            }
            return n == 1;
        }

        private int getNextNumber(int n) {
            int res = 0;
            while (n > 0) {
                int temp = n % 10;
                res += temp * temp;
                n = n / 10;
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
