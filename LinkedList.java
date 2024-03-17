
/*public class LinkedList {
 private Node head;
 public LinkedList() {
	 head=null;
 }
 public boolean isEmpty()
 {
	 if(head==null)
		 return true;
	 else 
		 return false;
 }
 public void insertData(String d)
 {
	 Node temp = new Node();
	 temp.setData(d);;
	 temp.setNext(temp);
	 head=temp;
 }
}*/
public class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insertData(String d) {
        Node temp = new Node();
        temp.setData(d);
        temp.setNext(null);

        if (isEmpty()) {
            head = temp;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(temp);
        }
    }

    public void deleteData(String d) {
        if (isEmpty()) {
            System.out.println("Error: The linked list is empty.");
            return;
        }

        if (head.getData().equals(d)) {
            head = head.getNext();
            return;
        }

        Node current = head;
        Node predecessor = null;

        while (current != null && !current.getData().equals(d)) {
            predecessor = current;
            current = current.getNext();
        }

        if (current == null) {
            System.out.println("Error: The element to be deleted does not exist in the linked list.");
            return;
        }

        predecessor.setNext(current.getNext());
    }
}
