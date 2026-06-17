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
        if(head == null) return null;
        
        HashMap<Node,Node> oldToNewmap = new HashMap<>();
        Node curr = head;

        while(curr != null){
            oldToNewmap.put(curr,new Node(curr.val));
            curr = curr.next; 
        }

        curr = head;
        while(curr != null){
            Node deepCopyNode = oldToNewmap.get(curr);
            deepCopyNode.next = oldToNewmap.get(curr.next);
            deepCopyNode.random = oldToNewmap.get(curr.random);
            curr = curr.next;
        } 

        return oldToNewmap.get(head);
    }
}
