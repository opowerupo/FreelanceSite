package main.kotlin.Medium

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

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun addTwoNumbers(L1: ListNode?, L2: ListNode?): ListNode? {
    println(message = L1?.`val`)
    return null
}

fun main(){
    var l1n1 = ListNode(5)
    var l1n2 = ListNode(7)
    var l1n3 = ListNode(2)
    var l1n4 = ListNode(6)

    l1n1.next = l1n2
    l1n2.next = l1n3
    l1n3.next = l1n4

    var l2n1 = ListNode(3)
    var l2n2 = ListNode(9)
    var l2n3 = ListNode(0)
    var l2n4 = ListNode(1)

    l2n1.next = l2n2
    l2n2.next = l2n3
    l2n3.next = l2n4

    addTwoNumbers(l1n1, l2n1)
}