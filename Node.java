
public class Node {

	private String data;
	private Node link;
	public Node()
	{
		data = null;
		link = null;
	}
	public String getData() {
		return data;
	}
	public void setData (String d) {
		data = d;
	}
	public Node getNext() {
	return link;
	}
	public void setNext(Node n) {
		link = n;
	}
}
