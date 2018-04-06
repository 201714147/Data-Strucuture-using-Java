package circleLinkedList;

public class Ex2 {

	public static void main(String[] args) {
		CLinkedList CL = new CLinkedList();
		System.out.println("(1) 공백 리스트에 노드 3개 삽입하기");
		CL.insertFirstNode("일");
		CL.insertFirstNode("수");
		CL.insertFirstNode("월");
		CL.printList();
		
		System.out.println("(2) 수 노드 뒤에 화 노드 삽입하기");
		CListNode pre = CL.searchNode("수");
		
		if(pre == null) {
			System.out.println("검색실패 >> 찾는 데이터가 없습니다.");
		}
		else {
			CL.insertMiddleNode(pre, "화");
			CL.printList();
		}

	}

}
