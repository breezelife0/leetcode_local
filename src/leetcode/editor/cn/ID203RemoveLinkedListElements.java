package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID203RemoveLinkedListElements {
    public static void main(String[] args) {
        Solution solution = new ID203RemoveLinkedListElements().new Solution();
        StringBuilder sb = new StringBuilder();
//        solution.removeElements(new ListNode(7, new ListNode(7, new ListNode(7, new ListNode(7)))), 7);
        solution.removeElements(new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1)))), 2);

        //执行测试

        System.out.println(sb);
    }
//leetcode submit region begin(Prohibit modification and deletion)


    class Solution {
        public ListNode removeElements0(ListNode head, int val) {
            if (head == null) {
                return null;
            }
            //第一遍遍历，处理头节点
            while (head != null && head.val == val) {
                head = head.next;
            }
            if (head == null) {
                return head;
            }
            //第二遍遍历，处理非头节点
            ListNode pre = head;
            ListNode cur = head.next;
            while (cur != null) {
                if (cur.val == val) {
                    pre.next = cur.next;
                } else {
                    pre = cur;
                }
                cur = cur.next;

            }
            return head;

        }

        /**
         * 添加虚节点方式（哑节点）——
         * 哑结点（或哑节点dummy）是链表中的一个概念。它通常被放在链表的头结点之前，用于简化与链表头相关的操作。
         * * 哑结点的引入使得所有数据结点【都拥有前驱结点】，从而方便执行链表的一些操作
         */
        public ListNode removeElements(ListNode head, int val) {
            if (head == null) {
                return null;
            }

            //添加哑节点
            ListNode dummy = new ListNode(-1, head);
            ListNode pre = dummy;
            ListNode cur = dummy.next;
            while (cur != null) {
                if (cur.val == val) {
                    pre.next = cur.next;
                } else {
                    pre = cur;
                }
                cur = cur.next;

            }
            return dummy.next;

        }
 
    }
//leetcode submit region end(Prohibit modification and deletion)

}
