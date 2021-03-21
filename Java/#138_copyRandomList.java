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
      if(head==null) return null;
        Map<Node,Node> map = new HashMap<Node,Node>();
        Node node = head;
        while(node!=null){
            map.put(node, new Node(node.val));
            node=node.next;
        }
       
        for(Map.Entry<Node,Node> s:map.entrySet()){
           Node n = s.getValue();
            n.next = map.get(s.getKey().next);
            n.random=map.get(s.getKey().random);
        }
        return map.get(head);
    }
}
