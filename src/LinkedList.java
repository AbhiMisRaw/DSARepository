public class LinkedList {
    private class Node{
        int value ;
        Node next ;
        Node(int value){
            this.value = value ;
            this.next = null ;
        }
    }

    private Node head ;
    private Node rear ;

    public int length;

    public void addAtFirst(int value){
        length++ ;
        Node curr = new Node(value);
        if(head == null && rear == null){
            head = rear = curr ;
        }else {
            curr.next = head ;
            head = curr ;
        }
    }

    public void addAtLast(int value){
        length++ ;
        Node curr = new Node(value);
        if(head == null && rear == null){
           head = rear = curr;
        }else{
            rear.next = curr;
            rear = curr ;
        }
    }
    public void append(int value){
        addAtLast(value);
    }

    public int search(int value){
        int count = 0 ;
        Node curr = head ;
        int l = length ;
        while( l >= 0){
            if(curr.value == value){
                return count ;
            }else{
                curr = curr.next ;
                count++ ;
            }
        }
        return -1 ;
    }


}
