package main.kotlin.Medium

class ListNode(var `val`: Int){
    var next: ListNode? = null
}

fun addTwoNumbers(L1: ListNode?, L2: ListNode?): ListNode?{
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