package unit6Practical;



public class LinkedList {
	private ListNode head;
	public LinkedList() {
		head = null;
	}
	/**
	 * 리스트 초기화 함수 구현, List에 아무것도 추가되지 않은 상태
	 */
	public void init() {
		head=null;
	}
	public void insertLastNode(String data) {
		ListNode newNode = new ListNode(data);
		if(head==null) {
			this.head=newNode;
		}
		else {
			ListNode temp = head;
			while(temp.link != null) temp = temp.link;
			temp.link = newNode;
		}


	}
	public void insertFirstNode(String data) {
		ListNode newNode = new ListNode(data);
		newNode.link=head;
		head = newNode;

	}


	public void deleteNode(String data) {
		ListNode pre,temp;
		if(head==null) return;
		else {
			pre = head;
			temp=head.link;

			while(temp.link != null)
			{
				
				if(temp.getData().equals(data)) {
					pre.link=temp.link;
					}
				pre=temp;
				temp=temp.link;
				
			}
			pre.link=temp;
			




		}
	}
	public ListNode searchNode(String data) {
		ListNode temp = this.head;
		while(temp!=null) {
			if(data == temp.getData())
				return temp;
			else temp = temp.link;

		}
		return temp;
	}
	public void printList() {
		ListNode temp = this.head;
		System.out.printf("L = (");
		while(temp != null) {
			System.out.printf(temp.getData());
			temp = temp.link;
			if(temp != null) {
				System.out.printf(", ");
			}
		}
		System.out.println(")");
	}
}
