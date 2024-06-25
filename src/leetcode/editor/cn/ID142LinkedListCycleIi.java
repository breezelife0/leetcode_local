package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID142LinkedListCycleIi {
    public static void main(String[] args) {
        Solution solution = new ID142LinkedListCycleIi().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }
//leetcode submit region begin(Prohibit modification and deletion)

    //使用了辅助空间，
//    解答成功:
//    执行耗时:3 ms,击败了21.28% 的Java用户
//    内存消耗:43.9 MB,击败了13.22% 的Java用户
//    public class Solution1 {
//        public ListNode detectCycle(ListNode head) {
//            if (head == null || head.next == null) {
//                return null;
//            }
//            HashSet<ListNode> nodeSet = new HashSet<>();
//            while (head != null) {
//                if (!nodeSet.contains(head)) {
//                    nodeSet.add(head);
//                } else {
//                    return head;
//                }
//                head = head.next;
//            }
//            return null;
//        }
//    }

    //标准解法：
//    这道题目，不仅考察对链表的操作，而且还需要一些数学运算。
//
//    主要考察两知识点：
//
//    判断链表是否环
//    如果有环，如何找到这个环的入口
// x y z;
    public class Solution {
        public ListNode detectCycle(ListNode head) {
            if (head == null || head.next == null) {
                return null;
            }
            //注意错开初始值，不然一开始就满足相等条件
            ListNode slow = head.next;
            ListNode fast = head.next.next;
            while (fast != null && fast.next != null && slow != fast) {
                fast = fast.next.next;
                slow = slow.next;
            }
            //无环
            if (slow != fast) {
                return null;
            }
            fast = head;
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow;


        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
