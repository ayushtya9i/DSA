// Linked List Insertion





class Solution
{
    //Function to insert a node at the beginning of the linked list.
    Node insertAtBeginning(Node head, int x)
    {
        // code here
        Node t=new Node(x);
        if(head==null)
        {
            
            return t;
        }
        t.next=head;
        head=t;
        return head;
    }
    
    //Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x)
    {
        // code here
        Node t=new Node(x);
        t.next=null;
         if(head==null)
        {
            
            return t;
        }
        else{
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
    
       temp.next=t;
        
        }
        return head;
    }
}