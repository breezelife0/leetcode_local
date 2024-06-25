package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID28FindTheIndexOfTheFirstOccurrenceInAString {
    public static void main(String[] args) {
        Solution solution = new ID28FindTheIndexOfTheFirstOccurrenceInAString().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //暴力， O(m*n)
    class SolutionMy {
        public int strStr(String haystack, String needle) {
            if (haystack == null || needle == null) return -1;
            if (haystack.length() < needle.length()) {
                return -1;
            }
            char[] arr1 = haystack.toCharArray();
            char[] arr2 = needle.toCharArray();
            int start1 = 0;
            int res = -1;

            while (start1 + arr2.length <= arr1.length) {
                int index = 0;
                while (index < arr2.length) {
                    if (arr1[start1 + index] == arr2[index]) {
                        index++;
                    } else {
                        break;
                    }
                }
                if (index == arr2.length) {
                    res = start1;
                    return res;
                }
                start1++;

            }
            return res;

        }
    }
    //【经典KMP算法】
//ABACABABX
//00101232
    //leetcode submit region begin(Prohibit modification and deletion)

//leetcode submit region end(Prohibit modification and deletion)

}
