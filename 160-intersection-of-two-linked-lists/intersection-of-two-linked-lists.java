/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode one=headA;
        ListNode two=headB;
        int a=0;
        int b=0;
        while(one!=null){
            a++;
            one=one.next;
        }
        while(two!=null){
             b++;
            two=two.next;
        }
        one=headA;
        two=headB;
        int start=0;
        if(a>b){
            start=a-b;
            while(start-->0){
                one=one.next;
            }
        }
        else if(b>a){
            start=b-a;
            while(start-->0){
                two=two.next;
            }
        }
        while(one!=null && two!=null){
            if(one==two){
                return one;
            }
            one=one.next;
            two=two.next;
        }
        return null;
    }
}