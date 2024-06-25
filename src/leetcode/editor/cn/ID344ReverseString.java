package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID344ReverseString {
    public static void main(String[] args) {
        Solution solution = new ID344ReverseString().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void reverseString(char[] s) {
            if (s.length <= 1) {
                return;
            }
            int mid = s.length / 2;
            //翻转走一半
            for (int i = 0; i < mid; i++) {
                //双指针
                char temp = s[i];
                s[i] = s[s.length - 1 - i];
                s[s.length - 1 - i] = temp;
            }
        }
    }


//leetcode submit region end(Prohibit modification and deletion)

}
