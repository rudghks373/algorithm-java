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
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode sort = new ListNode();
        if(list1==null && list2==null) {
            return null;
        }else{
            if (list1==null){
                return list2;
            }else if(list2==null){
                return list1;
            }else{
                if(list1.val<list2.val){
                    sort.val = list1.val;
                    sort.next = mergeTwoLists(list1.next, list2);
                }else{
                    sort.val = list2.val;
                    sort.next = mergeTwoLists(list1, list2.next);
                }
            }
        }
        return sort; 
    }
}
