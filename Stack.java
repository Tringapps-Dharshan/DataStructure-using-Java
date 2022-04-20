/**
 * Stack is a linear data structure.
 * Order may be Last In First Out
*/
public class Stack {
    int capacity=2;
    int stack[]=new int[capacity];
    int top=0;
    /**Adds an item in the stack
     * @param data get element from the user
    */
    public void push(int data){
        //If stack is full expand the stack capacity
        if(top==capacity){
            expand();
        }
        stack[top]=data;
        top++;
    }
    //Expanding the stack size by multiplying capacity into 2
    private void expand(){
        int length=top;
        int newStack[]=new int[capacity*2];
        System.arraycopy(stack, 0, newStack, 0, length);    
        stack=newStack;
        capacity*=2;
    }
    /**
     * Remove an item from the stack.
     * Ther items are popped in the reversed order in which they are pushed.
    */
    public int pop(){
        int data=0;
        //If stack is empty print Stack is empty.
        if(isEmpty()){
            System.out.println("Stack is empty");
        }else{
            top--;
            data=stack[top];
            stack[top]=0;
            shrink();
        }
        return data;
    }
    /**
     * shrink() is used to delete the unwanted memory spaces in a stack 
    */
    private void shrink(){
        int length=top;
        if(length<=(capacity/2)/2)
            capacity=capacity/2;
        int newStack[]=new int[capacity];
        System.arraycopy(stack, 0, newStack, 0, length);    
        stack=newStack;
    }
    /**
     * isEmpty() returns whether the stack is empty or not by using the top variable
    */
    public boolean isEmpty(){
        return top<=0;
    }
    /**
     * It returns the top most element of the stack
    */
    public int peek(){
        int data;
        data=stack[top-1];
        return data;
    }
    /**
     * Show the stack values
    */
    public void show(){
        for(int n:stack){
            System.out.print(n+" ");
        }
        System.out.println();
    }
 public static void main(String[] args) {
     Stack o=new Stack();
     o.push(15);
     o.push(8);
     o.push(10);
     o.push(20);
     o.push(30);
     o.push(40);
     System.out.println("Size of the stack is "+o.top);
     o.show();
     System.out.println("peek()-->"+o.peek());
     System.out.println("pop()-->"+o.pop());
     o.show();
     System.out.println("Size of the stack is "+o.top);
 }   
}
