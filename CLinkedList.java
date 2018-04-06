package week6;

public class CLinkedList {
	private CListNode CL;
	public CLinkedList() {
		CL =null;
	}
	
	
	public void insertFirstNode(String data) {
		CListNode newNode = new CListNode(data);
		if(CL==null) {
			CL = newNode;
			newNode.link=newNode;
			
		}
		else {
			CListNode temp = CL;
			while(temp.link!=CL) {
				temp = temp.link;
			}
			newNode.link=temp.link;
			temp.link=newNode;
			CL=newNode;
		}
		
	}
	public void insertMiddleNode(CListNode pre, String data) {
		CListNode newNode = new CListNode(data);
		if(CL==null) {
			CL=newNode;
			newNode.link=newNode;
		}
		else {
			newNode.link=pre.link;
			pre.link=newNode;
		}
	}
	public CListNode searchNode(String data) {
		CListNode temp = this.CL;
		while(temp.link !=CL) {
			if(data.equals(temp.getData()))
				return temp;
			else temp=temp.link;
		}
		return temp;
	}
	public void printList() {
		CListNode temp = this.CL;
		System.out.print("L = (");
		while(temp != null) {
			System.out.print(temp.getData());
			temp = temp.link;
			if(temp == this.CL) {
				System.out.println(")");
				break;
			}
			System.out.print(", ");
		}
	}


}
