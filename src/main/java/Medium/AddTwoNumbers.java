package main.java.Medium;

import main.java.common.module.ListNode;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode L1, ListNode L2) {

        return L2;
    }

    public static void main(String[] args) {

        ListNode l1n1 = new ListNode(3);
        ListNode l1n2 = new ListNode(6);
        ListNode l1n3 = new ListNode(7);
        ListNode l1n4 = new ListNode(9);

        l1n1.next = l1n2;
        l1n2.next = l1n3;
        l1n3.next = l1n4;

        ListNode l2n1 = new ListNode(5);
        ListNode l2n2 = new ListNode(2);
        ListNode l2n3 = new ListNode(1);

        l2n1.next = l2n2;
        l2n2.next = l2n3;

        AddTwoNumbers atn = new AddTwoNumbers();
        ListNode res = atn.addTwoNumbers(l1n1, l2n1);
        StringBuilder resBuilder = new StringBuilder();
        while (res.next != null) {
            resBuilder.append(res.val).append("->");
            res = res.next;
        }
        resBuilder.append(res.val);

        System.out.println(resBuilder.toString());
    }
}
