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
    public ListNode getIntersectionNode(ListNode heada, ListNode headb) {
        if(heada.next==headb) return headb;
        if(headb.next==heada) return heada;
        int cnt1=0,cnt2=0;
        ListNode t1=heada;
        while(t1.next!=null){
            t1=t1.next;
            cnt1++;
        }
         ListNode t2=headb;
        while(t2.next!=null){
            t2=t2.next;
            cnt2++;
        }
        if(heada==headb) return heada;
        ListNode temp1=heada,temp2=headb;
        if(cnt1<cnt2){
            int abs=cnt2-cnt1;
            for(int i=0;i<abs;i++)
            {
                temp2=temp2.next;
            }
            while(temp2!=null && temp1!=null){
                if(temp2==temp1) return temp2;
                temp1=temp1.next;
                temp2=temp2.next;
            } 
        }
        else{
            int abs=cnt1-cnt2;
            for(int i=0;i<abs;i++)
            {
                temp1=temp1.next;
            }
            while(temp1!=null && temp2!=null){
                if(temp1==temp2) return temp1;
                temp1=temp1.next;
                temp2=temp2.next;
            } 
        }
        return null;
        
    }
}
