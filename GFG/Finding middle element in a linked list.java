// https://practice.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1/?difficulty[]=0&page=1&company[]=Nagarro&query=difficulty[]0page1company[]Nagarro#

class Solution
{
    int getMiddle(Node head)
    {
         Node fast = head;
         Node slow = head;
         while(fast != null && fast.next!= null)
         {
             slow = slow.next;
             fast = fast.next.next;
         }
         return slow.data;
    }
}
