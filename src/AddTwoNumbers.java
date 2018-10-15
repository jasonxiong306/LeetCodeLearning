/**
 * 给定两个非空链表来表示两个非负整数。位数按照逆序方式存储，它们的每个节点只存储单个数字。将两数相加返回一个新的链表。
 * <p>
 * 你可以假设除了数字 0 之外，这两个数字都不会以零开头。
 * <p>
 * 示例：
 * <p>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
public class AddTwoNumbers {

    public static void main(String[] args) {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode l1 = new ListNode(2);
        ListNode l12 = new ListNode(4);
        l1.next = l12;
        ListNode l13 = new ListNode(3);
        l12.next = l13;
        ListNode l2 = new ListNode(5);
        ListNode l22 = new ListNode(6);
        l2.next = l22;
        ListNode l23 = new ListNode(4);
        l22.next = l23;
        addTwoNumbers.addTwoNumbers(l1, l2);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode o = result;
        ListNode p = l1;
        ListNode q = l2;
        int flag = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = x + y + flag;
            flag = sum / 10;
            o.next = new ListNode(sum % 10);
            o = o.next;
            p = (p != null) ? p.next : p;
            q = (q != null) ? q.next : q;
        }
        if (flag > 0) {
            o.next = new ListNode(flag);
        }

        return result.next;
    }
}


/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
