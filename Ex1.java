package week6;

public class Ex1 {

	public static void main(String[] args) {
		List A = new List();
		List B = new List();
		List C = new List();
		
		
		
		String A1 = "4x^5+2x^3+10x^2+1x^0";
		String B1 = "3x^4+2x^3+2x^2+4x^1";
		
		float [] x = changingToArray(A1);
		float [] y = changingToArray(B1);
		for(int i=0;i<x.length;i++)
		{
			if(i%2==0) {
				A.appendTerm(x[i], (int)x[i+1]);
			}
		}
		for(int i=0;i<y.length;i++)
		{
			if(i%2==0) {
				B.appendTerm(y[i], (int)y[i+1]);
			}
		}
		C =addPoly(A, B);
		
		Node z = new Node();
		z=C.getPL();
		Node temp = new Node();
		temp=z;
		while(temp!=null) {
			System.out.print("+"+temp.getCoef()+"x"+"^"+temp.getExpo());
			temp=temp.link;
		}
		
		
		
		
		
		// 1. �쐞�쓽 A�� B�뿉 �빐�떦�븯�뒗 �떎�빆�떇�쓣 appendTerm 硫붿꽌�뱶瑜� �씠�슜�븯�뿬 �빐�떦 由ъ뒪�듃�뿉 �궫�엯
		// 2. addPoly 硫붿뒪�듃瑜� �씠�슜�븯�뿬 由ъ뒪�듃 C�뿉 �뿰�궛 寃곌낵 由ъ뒪�듃瑜� �옄�옣
		// 3. C�쓽 �떎�빆�떇�쓣 寃곌낵�솕硫닿낵 媛숈씠 異쒕젰�븳�떎.
		// (怨꾩닔媛� �뼇�닔�씪 寃쎌슦 +, �쓬�닔�씪 寃쎌슦 -濡� �몴�떆. 理쒓퀬李� �빆�쓽 怨꾩닔�뒗 �뵲濡� 泥섎━�븯吏� �븡�뒗�떎.)
		
		
		
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

