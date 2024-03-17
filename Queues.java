
public class Queues implements ArrayQueues {
	private int front;
	private int size;
	private int rear;
	private String Q[]; //array variable
	private int capacity; //your N variable
	public Queues(int cap) { //parameterized constructor for return type array
		front=0;
		rear=0;
		capacity=cap;
		Q=new String[capacity];
	}
	public boolean isEmpty() {
		if(front==rear)
			return true;
		else
			return false;
	}
	public String front()
	{
		if(isEmpty())
			System.out.println("The Queue is Empty");
		else
			return Q[front];
	}
	public String dequeue() {
		String temp = Q[front];
		Q[front]=null;
		front=(front+1)% capacity;
		return temp;
	}
	public void enqueue() {
	if (size()==capacity-1)	
		System.out.println("Queue is full");
	   String temp1= new String();
	   Q[rear]=temp1;
	   rear=(rear+1)% capacity;
		return;
	}
	public int size() {
		return (capacity-front+rear)%capacity;
	}
}
