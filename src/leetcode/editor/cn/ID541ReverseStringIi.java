package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID541ReverseStringIi {
    public static void main(String[] args) {
        Solution solution = new ID541ReverseStringIi().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试
//        solution.reverseStr("abcdefg", 2);
        solution.reverseStr("abcdefg", 8);

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String reverseStr(String s, int k) {
            //注意审题！！！
            //如果剩余字符少于 k 个，则将剩余字符全部反转。
            if (s == null || s.length() < 2 || k <= 1) {
                return s;
            }
            char[] charArray = s.toCharArray();
            int length = charArray.length;

            int n = 1;
            while (n * k <= length) {

                //偶数段不动
                if (n % 2 == 0) {
                    n++;
                    continue;
                }
                //奇数段翻转

//                i=4, i<5;
                int offset = (n - 1) * k; //偏移
//				int mid = end / 2; //Mid中间陷阱xxx
                for (int i = 0; i < k / 2; i++) {
                    char tmp = charArray[offset + i];
//                    charArray[i] = charArray[n * k + k - 1 - i]; //不对， 交换位置不对
                    charArray[offset + i] = charArray[offset + k - 1 - i];
                    charArray[offset + k - 1 - i] = tmp;
                }
                n++;
            }
            //最后一段单独处理
            //注意运算符优先级！！ % 和 * 优先级一样， 需要加括号！！
            if (length % (2 * k) < k) {
                int yu = length % k;
                int offset = length - yu;
                for (int i = 0; i < yu / 2; i++) {
                    char tmp = charArray[offset + i];
                    charArray[offset + i] = charArray[offset + yu - 1 - i];
                    charArray[offset + yu - 1 - i] = tmp;
                }

            }
//           // String res = charArray.toString(); // 不对，得到的对象hash 值
            // return s; // 不对，  char[] charArray = s.toCharArray();之后就和s没有关系了
            String res = new String(charArray);

            return res;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
