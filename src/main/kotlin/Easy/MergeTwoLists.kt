package main.kotlin.Easy

import main.common.module.ListNode


/**
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 *
 * 示例：
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 */

fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
    var ln1 = l1
    var ln2 = l2
    var rsphead = ListNode(0)
    var rsp: ListNode? = rsphead
    while (ln1 != null && ln2 != null) {
        if (ln1.`val` < ln2.`val`) {
            rsphead.next = ln1
            ln1 = ln1.next
        } else {
            rsphead.next = ln2
            ln2 = ln2.next
        }
        rsphead = rsphead.next
    }
    if (ln1 == null) {
        rsphead.next = ln2;
    } else {
        rsphead.next = ln1;
    }
    var res = rsp?.next

    rsp?.next = null
    rsp = null

    return res
}

fun main() {

    var l1n1 = ListNode(1)
    var l1n2 = ListNode(2)
    var l1n3 = ListNode(4)
    var l1n4 = ListNode(6)

    l1n1.next = l1n2
    l1n2.next = l1n3
    l1n3.next = l1n4

    var l2n1 = ListNode(1)
    var l2n2 = ListNode(3)
    var l2n3 = ListNode(4)
    var l2n4 = ListNode(8)

    l2n1.next = l2n2
    l2n2.next = l2n3
    l2n3.next = l2n4

    var res = mergeTwoLists(l1n1, l2n1)
    val resBuilder = StringBuilder()
    while (res != null && res.next != null) {
        resBuilder.append(res.`val`).append("->")
        res = res.next
    }
    if (res != null) {
        resBuilder.append(res.`val`)
    }

    println(resBuilder.toString())
}