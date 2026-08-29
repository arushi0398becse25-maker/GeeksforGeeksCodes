/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public boolean searchKey(Node head, int key) {
        // Code here
        Node j=head;
        while(j!=null){
            if(j.data==key){
                return true;
            }
            j=j.next;
        }
        return false;
    }
}