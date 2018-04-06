package circleLinkedList;

public class CListNode {
	private String data;
	public CListNode link;
	public CListNode() {
		this.data=null;
		this.link=null;
		
	}
	public CListNode(String data) {
		this.data=data;
		this.link=null;
	}
	public CListNode(String data, CListNode link) {
		this.data=data;
		this.link=link;
	}
	public String getData() {
		return this.data;
	}

}
