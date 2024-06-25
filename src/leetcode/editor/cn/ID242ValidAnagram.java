package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID242ValidAnagram {
    public static void main(String[] args) {
        Solution solution = new ID242ValidAnagram().new Solution();
        StringBuilder sb = new StringBuilder();
        solution.isAnagram("anagram", "nagaram");
        //执行测试

        System.out.println(sb);
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isAnagram(String s, String t) {
            int[] times = new int[26];
            for (int i = 0; i < s.length(); i++) {
                times[s.charAt(i) - 'a']++;
            }
            for (int i = 0; i < t.length(); i++) {
                int time = times[t.charAt(i) - 'a'];
                if (time > 0) {
                    times[t.charAt(i) - 'a']--;
                } else {
                    return false;
                }
            }
            for (int i = 0; i < times.length; i++) {
                if (times[i] > 0) {
                    return false;
                }
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
