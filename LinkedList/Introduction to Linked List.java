// Introduction to Linked List





class Solution {
    static Node constructLL(int arr[]) {
        // code here
          int n=arr.length;
          if(n==0)
          return null;
        Node head = new Node(arr[0]);
       Node nn=head;
      
        for(int i=1;i<n;i++){
           Node next= new Node(arr[i]);
           nn.next=next;
           nn=next;
            
        }
        return head;
    }
}