package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID151ReverseWordsInAString {
    public static void main(String[] args) {
        Solution solution = new ID151ReverseWordsInAString().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }
//	所以这里我还是提高一下本题的难度：不要使用辅助空间，空间复杂度要求为O(1)。


    //所以解题思路如下：
    //
    //移除多余空格
    //将整个字符串反转
    //将每个单词反转
    //举个例子，源字符串为："the sky is blue "
    //
    //移除多余空格 : "the sky is blue"
    //字符串反转："eulb si yks eht"
    //单词反转："blue is sky the"
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String reverseWords(String s) {

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
