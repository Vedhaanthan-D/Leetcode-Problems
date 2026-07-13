/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;ext;
 *     ListNode n
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode findmid(ListNode head){
        ListNode slow=head;
        ListNode fast=head;

        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean isPalindrome(ListNode head) {
        // List<Integer> arr=new ArrayList<>();

        // while(head!=null){
        //     arr.add(head.val);
        //     head=head.next;
        // }   
        // int left=0;
        // int right=arr.size()-1;

        // while(left<right){
        //     if(!arr.get(left).equals(arr.get(right))){
        //         return false;
        //     }
        //     left++;
        //     right--;
        // }
        // return true;

        ListNode mid=findmid(head);
        ListNode prev=null;
        ListNode curr=mid.next;

        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        ListNode right=prev;
        ListNode left=head;

        while(right!=null){
            if(left.val!= right.val){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
}