package unit6Practical;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ex1_1 {

	public static void main(String[] args) {
		LinkedList L = new LinkedList();
		
		Scanner sc = new Scanner(System.in);
		String inputstr = sc.nextLine();
		System.out.println("(1) 공백 리스트에 문자열 삽입하기");
		ArrayList <String> a = new ArrayList(); 
		for(int i=0;i<inputstr.length()-1;i++) {
			/**
			 * 1. 입력받은 문자열을 list에 추가 (3점)
			 * 단, 중복된 문자된 문자가 있을 경우 한 번만 ,list에 추가
			 * ex> 입력 :  I LOVE MY FAMILY
			 * L = (I, , L, O, V, E, M, Y, F, A)
			 */

			String c =Character.toString(inputstr.charAt(i));

			if(!a.contains(c))
			{
				L.insertLastNode(c);
				a.add(c);
			}


		}
		L.printList();

		System.out.println("(2) 공백제거");

		/**
		 * 2. 삽압된 리스트 공백이 있을 겨우 제거
		 * searchNode(String data) 사용
		 * 작성한 메서드 deleteNode(String data) 사용
		 */
	
		if(L.searchNode(" ")== null) {
		L.deleteNode(" ");
		}
		L.printList();
		System.out.println("(3) list의 가장 앞에 문자 추가");
		/**
		 * 3. 리스트의 가장 앞에 " 추가
		 * 작성한 메서드 insertFirstNode(String data) 사용
		 */
		L.insertFirstNode("\"");

		L.printList();

		System.out.println("(4) 리스트 초기화");
		L.init();
		L.printList();


	}

}
