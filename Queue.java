/**
 * Stack is a abstract data structure.
 * Order may be First In First Out
*/
public class Queue {
    int queue[]=new int[5];
    int size;
    int front;
    int rear;
    /**
     * add an item to the queue
     * @param data get the value from the user and store it to queue
    */
    public void enQueue(int data){
        //if queue is not full store element to the queue.
        if(!isFull()){
            queue[rear]=data;
            rear=(rear+1)%5;
            size+=1;
        }else{
            System.out.println("Queue is full");
        }
    }    
    /**
     * remove an item from the queue
    */
    public int deQueue(){
        int data=queue[front];
        if(!isEmpty()){
            front=(front+1)%5;
            size-=1;
        }else
            System.out.println("Queue is empty");
        return data;
    }
    //Print all the values in the queue
    public void show(){
        System.out.println("Elements : ");
        for(int i=0;i<size;i++){
            System.out.println(queue[(front+i)%5]);
        }
        System.out.println();
        for(int n:queue){
            System.out.println(n+"");
        }
    }
    //Get the size of a queue
    public int getSize(){
        return size;
    }
    //Checks if the queue is empty
    public boolean isEmpty(){
        return size==0;
    }
    //Checks the queue is full
    public boolean isFull(){
        return size==5;
    }
    public static void main(String[] args) {
        Queue q=new Queue();
        q.enQueue(5);
        q.enQueue(2);
        q.enQueue(7);
        q.enQueue(3);
        //q.deQueue();
        //q.deQueue();
        q.enQueue(9);
        q.enQueue(1);
        //q.enQueue(19);
        //q.enQueue(15);
        System.out.println(q.isFull());
        System.out.println("Size "+q.getSize());
        q.show();
    }
}
