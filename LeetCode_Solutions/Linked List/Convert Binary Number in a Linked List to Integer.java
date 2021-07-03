class Solution {
     public int getDecimalValue(ListNode head) {
        StringBuilder s=new StringBuilder();
        while(head!=null){
            s.append(head.val);
            head=head.next;
        }
        return Integer.parseInt(s.toString(),2);
    }
}