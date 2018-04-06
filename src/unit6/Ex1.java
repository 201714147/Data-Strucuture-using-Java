package circleLinkedList;

public class Ex1 {

	public static void main(String[] args) {
		List A = new List();
		List B = new List();
		List C = new List();
		
		
		/**
		 * 메인문 작성
		 * A : 4x^5+2x^3+10x^2+1x^0
		 * B : 3x^4-2x^3+2x^2-4x^1
		 * C : 결과 >
		 */
		String A1 = "4x^5+2x^3+10x^2+1x^0";
		String B1 = "3x^4-2x^3+2x^2-4x^1";
		
		
		
		// 1. 위의 A와 B에 해당하는 다항식을 appendTerm 메서드를 이용하여 해당 리스트에 삽입
		// 2. addPoly 메스트를 이용하여 리스트 C에 연산 결과 리스트를 자장
		// 3. C의 다항식을 결과화면과 같이 출력한다.
		// (계수가 양수일 경우 +, 음수일 경우 -로 표시. 최고차 항의 계수는 따로 처리하지 않는다.)
		
		
		
	}
	public static List addPoly(List A, List B) {
		List C = new List();
		Node p = A.getPL();
		Node q = B.getPL();
		while(p !=null && q != null) {
			if(p.getExpo() == q.getExpo()) {
				C.appendTerm((p.getCoef()+q.getCoef()), p.getExpo());
				p=p.link;
				q=q.link;
			}
			else if(p.getExpo()<q.getExpo()) {
				C.appendTerm(q.getCoef(), q.getExpo());
				q=q.link;
			}
			else {
				C.appendTerm(p.getCoef(), p.getExpo());
				p=p.link;
			}
		}
		while(p!=null) {
			C.appendTerm(p.getCoef(), p.getExpo());
			p=p.link;
		}
		while(q!=null) {
			C.appendTerm(q.getCoef(), q.getExpo());
			q=q.link;
		}
		return C;
	}
	public static float [] changingToArray(String string) {
		String [] str =  string.split("[a-zA-Z\\\\+^]+");
		int j=0;
		float intArray[]=new float[str.length];
		for(String str1: str)
		{
			intArray[j]=Integer.parseInt(str1);
			j++;
		}
		return intArray;
	}
	

}
