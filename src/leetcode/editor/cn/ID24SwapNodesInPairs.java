package leetcode.editor.cn;

import java.util.*;

import com.azul.crs.client.service.ClientService;
import leetcode.editor.util.*;

public class ID24SwapNodesInPairs {
    public static void main(String[] args) {
        Solution solution = new ID24SwapNodesInPairs().new Solution();
        StringBuilder sb = new StringBuilder();
        ListNode listNode = solution.swapPairs(ListNode.of("1,2,3,4"));
        //执行测试

        System.out.println(listNode);
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
     * cur, next,
     * next, cur, tmp
     */
    class Solution {
        public ListNode swapPairs(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }

            //cur , next, temp
            ListNode cur = head;
            ListNode newHead = head.next;
            ListNode next = cur.next;
            while (cur != null && next != null) {
                ListNode group2_first = next.next;
                ListNode temp = cur.next.next;
                cur.next.next = cur;
                cur.next = temp;

                cur = temp;
            }
            return newHead;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
