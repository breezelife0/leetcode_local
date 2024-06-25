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


    class Solution {
//        public ListNode swapPairs(ListNode head) {
//            if (head == null || head.next == null) {
//                return head;
//            }
//            ListNode newHead = head.next;
//
//            ListNode cur = head;
//            ListNode next = cur.next;
//            cur = next;
//
//            //  cur, next, group2_first
//            //  next, cur, group2_first
//            while (cur != null && next != null) {
//                ListNode group2_first = next.next;
//                next.next = cur;
//                cur.next = group2_first;
//
//                cur = group2_first;
//                if (cur == null) {
//                    break;
//                }
//                next = cur.next;
//            }
//            return newHead;
//        }

        //引入虚节点处理头节点，非常好用
        public ListNode swapPairs(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }
            ListNode dummy = new ListNode(-1, head);

            ListNode cur = dummy;
//            cur, next1,next2, temp
            while (cur.next != null && cur.next.next != null) {
                ListNode next1 = cur.next;
                ListNode next2 = next1.next;
                ListNode temp = next2.next;

                next2.next = next1;
                next1.next = temp;
                cur.next = next2;
                cur = next1;
            }
            return dummy.next;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
