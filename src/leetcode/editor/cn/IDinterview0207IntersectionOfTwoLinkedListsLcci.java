package leetcode.editor.cn;

import leetcode.editor.util.*;

public class IDinterview0207IntersectionOfTwoLinkedListsLcci {
    public static void main(String[] args) {
        Solution solution = new IDinterview0207IntersectionOfTwoLinkedListsLcci().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }
//leetcode submit region begin(Prohibit modification and deletion)

    //  1234567
//  4567
    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            if (headA == null || headB == null) {
                return null;
            }
            //长度差
            ListNode pa = headA;
            ListNode pb = headB;
            while (pa != null && pb != null) {
                pa = pa.next;
                pb = pb.next;
            }
            int diff = 0;
            ListNode longList = headA;
            ListNode shortList = headB;
            while (pa != null) {
                longList = headA;
                shortList = headB;
                pa = pa.next;
                diff++;
            }
            while (pb != null) {
                longList = headB;
                shortList = headA;
                pb = pb.next;
                diff++;
            }

            //末端对齐，舍去头部
            for (int i = 0; i < diff; i++) {
                longList = longList.next;
            }
            while (longList != null && longList != shortList) {
                longList = longList.next;
                shortList = shortList.next;
            }
            return longList;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
