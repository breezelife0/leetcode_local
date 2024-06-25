package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID19RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {
        Solution solution = new ID19RemoveNthNodeFromEndOfList().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }
//leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            if (head == null || n < 0) {
                return head;
            }
            ListNode dummy = new ListNode(-1, head);
            ListNode cur = dummy;
            ListNode slow = dummy;
            ListNode fast = dummy;
			//差n步
            for (int i = 0; i < n; i++) {
                if (fast == null) {
                    return head;
                }
                fast = fast.next;
            }
			//fast.next != null  等价于  fast是最后一个节点
            while (fast.next != null) {
                fast = fast.next;
                slow = slow.next;
            }
            slow.next = slow.next.next;

            return dummy.next;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
