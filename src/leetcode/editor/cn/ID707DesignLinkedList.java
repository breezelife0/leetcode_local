package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID707DesignLinkedList {
    public static void main(String[] args) {
        MyLinkedList list = new ID707DesignLinkedList().new MyLinkedList();
        StringBuilder sb = new StringBuilder();
//        list.addAtHead(1);
//        list.addAtTail(3);
//        list.addAtIndex(1, 2);
//        list.get(1);
//        list.deleteAtIndex(1);
//        list.get(1);
// =============
        list.addAtHead(7);
        list.addAtHead(2);
        list.addAtHead(1);
        list.addAtIndex(3, 0);
        list.deleteAtIndex(2);
        list.addAtHead(6);
        list.addAtTail(4);
        list.get(4);
        list.addAtIndex(5, 0);
        list.addAtHead(6);


        //执行测试;

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class MyLinkedList {
        int size;
        ListNode head;

        //初始化
        public MyLinkedList(ListNode head, int size) {
            this.head = head;
            this.size = 0;
        }

        public MyLinkedList() {

            this.size = 0;
        }

        public int get(int index) {
            if (index >= size) {
                return -1;
            }
            int curIndex = 0;
            ListNode cur = head;
            while (curIndex < index) {
                curIndex++;
                cur = cur.next;
            }
            return cur.val;
        }

        public void addAtHead(int val) {
            ListNode newHead = new ListNode(val, head);
            this.head = newHead;
            this.size++;

        }

        public void addAtTail(int val) {
            addAtIndex(size, val);

        }

        public void addAtIndex(int index, int val) {
            if (index > size) return;
            if (index == 0) {
                addAtHead(val);
                return;
            }


            ListNode pre = head;
            ListNode cur = head.next;
            int curIndex = 1;  //注意

            //找前驱
            while (curIndex < index) {
                curIndex++;
                pre = cur;
                cur = cur.next;
            }
            //插入
            pre.next = new ListNode(val, cur);
            this.size++;

        }

        public void deleteAtIndex(int index) {
            if (index >= size) return;
            if (index == 0) {
                this.head = head.next;
                this.size--;
                return;
            }

            ListNode pre = head;
            ListNode cur = head.next;
            int curIndex = 1; //注意

            //找前驱
            while (curIndex < index) {
                curIndex++;
                pre = cur;
                cur = cur.next;
            }
            pre.next = cur.next;
            this.size--;
        }


    }

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
//leetcode submit region end(Prohibit modification and deletion)

}
