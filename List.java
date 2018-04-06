package week6;

public class List {
	private Node PL, last;
	List(){
		PL=null;
		last=null;
	}
	public void appendTerm(float coef, int expo) {
		Node node = new Node();
		node.setCoef(coef);
		node.setExpo(expo);
		node.setLink(null);
		
		if(PL==null) {
			PL=node;
			last=node;
		}
		else {
			last.link=node;
			last = node;
		}
		
		
	}
	public Node getPL() {
		return PL;
	}
	public void setPl(Node pL) {
		PL=pL;
	}
	public Node getLast() {
		return last;
	}
	public void setLast(Node last) {
		this.last=last;
	}

}
