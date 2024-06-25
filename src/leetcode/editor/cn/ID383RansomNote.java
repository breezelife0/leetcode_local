package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID383RansomNote {
    public static void main(String[] args) {
        Solution solution = new ID383RansomNote().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试
        solution.canConstruct("a", "b");
        System.out.println(sb);
    }
//因为题目说只有小写字母，那可以采用空间换取时间的哈希策略，用一个长度为26的数组来记录magazine里字母出现的次数。

    //字母转int -'a'
//	依然是数组在哈希法中的应用。
//
//	一些同学可能想，用数组干啥，都用map完事了，其实在本题的情况下，使用map的空间消耗要比数组大一些的，
//	因为map要维护红黑树或者哈希表，而且还要做哈希函数，是费时的！数据量大的话就能体现出来差别了。 所以数组更加简单直接有效！

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {
            if (ransomNote.length() > magazine.length()) {
                return false;
            }
            char[] charArray = magazine.toCharArray();
            int[] count = new int[26];
            for (int i = 0; i < charArray.length; i++) {
                count[charArray[i] - 'a']++;
            }

            char[] noteArr = ransomNote.toCharArray();
            for (int i = 0; i < noteArr.length; i++) {
                count[noteArr[i] - 'a']--;
                if (count[noteArr[i] - 'a'] < 0) {
                    return false;
                }
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
