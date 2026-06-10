class MyLinkedList {
   
    class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;
            this.next=null;

        }
    }
      public static Node head;
        public static Node tail;
        public static int size;

    public MyLinkedList() {
        head =null;
        tail = null;
        size=0;
      
    }

    
    public int get(int index) {

if(index<0 || index>= size){
    return -1;
}

        int i=0;
        Node temp=head;
        while(i<index){
            temp = temp.next;
            i++;

        }


    
        return temp.val;
        
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        size++;

        if(head==null){
            head = tail=newNode;
            return;
             }

        newNode.next=head;
        head = newNode;



        
    }
    
    public void addAtTail(int val) {
         Node newNode = new Node(val);
         size++;

        if(head==null){
            head = tail=newNode;
            return;
             }

        tail.next = newNode;
        tail= newNode;
       


        
    }
    
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) {
            return;
        }

        if (index == 0) {
            addAtHead(val);
            return;
        }

        if (index == size) {
            addAtTail(val);
            return;
        }

      Node newNode = new Node(val);

      Node temp=head;
      int i=0;

      while(i<index-1){
        temp = temp.next;
        i++;

      }
      newNode.next = temp.next;
      temp.next = newNode;
      size++;
        
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }

        if (index == 0) {
            head = head.next;
            size--;

            if (size == 0) {
                tail = null;
            }
            return;
        }
        Node temp=head;
        int i=0;

        while(i<index-1){
            temp = temp.next;
            i++;

        }
        if(temp.next==tail){
            tail = temp;
        }
        temp.next=temp.next.next;
        size--;


        
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */