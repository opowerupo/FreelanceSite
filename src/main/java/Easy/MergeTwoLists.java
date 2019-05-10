package main.java.Easy;

import main.java.util.ListNode;

/**
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 *
 * 示例：
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 */
public class MergeTwoLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res = l1.val < l2.val ? l1 : l2;
        ListNode temp = l1;
        while (l1.next != null) {
            if (l1.val < l2.val) {
                temp = l1.next;
                l1.next = l2;
                l1 = temp;
            } else {

            }
        }

        return null;
    }

    public static void main(String[] args) {

        ListNode l1n1 = new ListNode(3);
        ListNode l1n2 = new ListNode(6);
        ListNode l1n3 = new ListNode(7);
        ListNode l1n4 = new ListNode(9);

        l1n1.next = l1n2;
        l1n2.next = l1n3;
        l1n3.next = l1n4;

        ListNode l2n1 = new ListNode(1);
        ListNode l2n2 = new ListNode(2);
        ListNode l2n3 = new ListNode(5);

        l2n1.next = l2n2;
        l2n2.next = l2n3;

        MergeTwoLists mtl = new MergeTwoLists();
        ListNode res = mtl.mergeTwoLists(l1n1, l2n1);
        StringBuilder resBuilder = new StringBuilder();
        while (res.next != null) {
            resBuilder.append(res.val).append("->");
            res = res.next;
        }
        resBuilder.append(res.val);

        System.out.println(resBuilder.toString());
    }
}
