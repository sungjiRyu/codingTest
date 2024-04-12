package addTwoNumbers;


// You are given two non-empty linked lists representing two non-negative integers. 
// The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
// You may assume the two numbers do not contain any leading zero, except the number 0 itself.

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode();
        ListNode answer = listNode;
        int roundUp = 0;


        while (l1 != null || l2 != null) {
            int sum = roundUp;
            
            // l1의 원소들을 더해서
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            roundUp = sum / 10;
            sum %= 10;

            listNode.next = new ListNode(sum);
            listNode = listNode.next;
        }

        if (roundUp > 0) {
            listNode.next = new ListNode(roundUp);
        }

        return answer.next;
    }
}