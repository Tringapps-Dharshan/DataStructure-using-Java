/**
 * Creating class Node with the datapart and address part.
*/
class Node {
    int data;
    Node next;
}
/**
 * Createing LinkedList class to perform LinkedList operations
*/
class LinkedList {
    Node head;
    /**
        * Insert element at the end of the list
        * @param data get the element from the user
    */
    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        //If head is empty assign the node to head
        if (head == null) {
            head = node;
        } else {
            Node n = head;
            //Traversing till reach null
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }
    /**
        * Insert element at the beginning of the LinkedList
        * @param data get the element from the user
    */
    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;
    }
    /**
     * Insert element at the specified index position.
     * @param index get the index value from the user
     * @param data get the element from the user
    */
    public void insertAt(int index,int data){
        Node node=new Node();
        node.data=data;
        node.next=null;
        Node n=head;
        //Traversing to the last element
        for(int i=0;i<index-1;i++){
            n=n.next;
        }
        node.next=n.next;
        n.next=node;
        //Check whether the given index is 0
        if(index==0){
            insertAtStart(data);
        }
    }
    /**
        * delete the element by index value
        * @param index get index value from the user
    */
    public void deleteAt(int index){
        if(index==0){
            head=head.next;
        }else{
            Node n=head;
            Node n1=null;
            for(int i=0;i<index-1;i++){
                n=n.next;
            }
            n1=n.next;
            n.next=n1.next;
        }
    }
    /**
        * Show the linked list element till the end of LinkedList
    */
    public void show() {
        Node node = head;
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        //Print the last element because the last node contain nullvalue.
        System.out.println(node.data);
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insertAtStart(0);
        list.insertAt(3, 3);
        list.insert(8);
        list.insert(4);
        System.out.println("-------");
        list.show();
        System.out.println("-------");
        list.deleteAt(4);
        list.show();
        System.out.println("-------");
    }
}
