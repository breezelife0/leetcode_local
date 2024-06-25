package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID349IntersectionOfTwoArrays {
    public static void main(String[] args) {
        Solution solution = new ID349IntersectionOfTwoArrays().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            HashSet<Integer> set1 = new HashSet<>();
			HashSet<Integer> set2 = new HashSet<>();
			ArrayList<Integer> resList = new ArrayList<>();

			for (int i = 0; i < nums1.length; i++) {
                set1.add(nums1[i]);
            }
			for (int i = 0; i < nums2.length; i++) {
				set2.add(nums2[i]);
			}
			for (int a : set2){
				if (set1.contains(a)){
					resList.add(a);
				}
			}
			if(resList.size() == 0){
				return new int[]{};
			}
			int[] res = new int[resList.size()];
			for (int i = 0; i < resList.size(); i++) {
				res[i] = resList.get(i);
			}

            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
