package unit6Practical;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ex1_1 {

	public static void main(String[] args) {
		LinkedList L = new LinkedList();
		
		Scanner sc = new Scanner(System.in);
		String inputstr = sc.nextLine();
		System.out.println("(1) ���� ����Ʈ�� ���ڿ� �����ϱ�");
		ArrayList <String> a = new ArrayList(); 
		for(int i=0;i<inputstr.length()-1;i++) {
			/**
			 * 1. �Է¹��� ���ڿ��� list�� �߰� (3��)
			 * ��, �ߺ��� ���ڵ� ���ڰ� ���� ��� �� ���� ,list�� �߰�
			 * ex> �Է� :  I LOVE MY FAMILY
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

		System.out.println("(2) ��������");

		/**
		 * 2. ��е� ����Ʈ ������ ���� �ܿ� ����
		 * searchNode(String data) ���
		 * �ۼ��� �޼��� deleteNode(String data) ���
		 */
	
		if(L.searchNode(" ")== null) {
		L.deleteNode(" ");
		}
		L.printList();
		System.out.println("(3) list�� ���� �տ� ���� �߰�");
		/**
		 * 3. ����Ʈ�� ���� �տ� " �߰�
		 * �ۼ��� �޼��� insertFirstNode(String data) ���
		 */
		L.insertFirstNode("\"");

		L.printList();

		System.out.println("(4) ����Ʈ �ʱ�ȭ");
		L.init();
		L.printList();


	}

}
