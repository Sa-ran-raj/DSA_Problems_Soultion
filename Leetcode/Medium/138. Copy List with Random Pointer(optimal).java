/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node temp=head;
        // Inserting new nodes inbetween the exisiting nodes
        while(temp!=null){
            Node newnode=new Node(temp.val);
            newnode.next=temp.next;
            temp.next=newnode;
            temp=temp.next.next;
        }
        temp=head;
        // connecting random pointers
        while(temp!=null){
            Node copy=temp.next;
            if(temp.random==null){
                copy.random=null;
            }
            else{
                copy.random=temp.random.next;
            }
            temp=temp.next.next;
        }

        //seperating copied nodes and original node;

        temp=head;
        Node dummy=new Node(-1);
        Node res=dummy;
        while(temp!=null){
            res.next=temp.next;
            temp.next=temp.next.next;
            res=res.next;
            temp=temp.next;

        }
        return dummy.next;
        
    }
}
