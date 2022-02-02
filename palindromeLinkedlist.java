/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//To find the node next to the mid of the linked list. For example: 1 2 3 4 5, mid = 4 and 1 2 3 4 5 6, mid = 4
//Reverse the linked list from the mid till end.
//Now start traversing the linked list from start with pointer_1 and from mid with pointer_2.
//If both values are not equal then return false otherwise return true when pointer_1 or pointer_2 become null.
class Solution {
   ListNode getMid(ListNode head) {
		ListNode slow = head, fast = head;
		while (fast != null) {
			slow = slow.next;
			fast = fast.next == null ? null : fast.next.next;
		}
		return slow;
	}

	ListNode reverse(ListNode head) {
		ListNode prev = null, curr = head, next = head.next;
		while (curr != null) {
			curr.next = prev;
			prev = curr;
			curr = next;
			if (next != null)
				next = next.next;
		}
		return prev;
	}

	boolean isPalindrome(ListNode head) {
		if (head == null) return false;
		ListNode mid = getMid(head);
		if (mid != null) // this is to handle when there is only 1 element
			mid = reverse(mid);
		ListNode pointer_1 = head, pointer_2 = mid;
		while (pointer_1 != null && pointer_2 != null) {
			if (pointer_1.val != pointer_2.val)
				return false;
			pointer_1 = pointer_1.next;
			pointer_2 = pointer_2.next;
		}
		return true;
	}
}
