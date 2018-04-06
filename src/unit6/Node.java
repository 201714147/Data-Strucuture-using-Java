package circleLinkedList;

public class Node {
	float coef;
	int expo;
	Node link;
	
	Node(){
		this.link=null;
	}
	Node(float coef, int expo){
		this.coef=coef;
		this.expo=expo;
	}
	Node(float coef, int expo, Node link){
		this.coef=coef;
		this.expo=expo;
		this.link=link;
	}
	public float getCoef() {
		return coef;
	}
	public void setCoef(float coef) {
		this.coef=coef;
	}
	public int getExpo() {
		return expo;
	}
	public void setExpo(int expo) {
		this.expo=expo;
	}
	public Node getLink() {
		return link;
	}
	public void setLink(Node link) {
		this.link=link;
	}
	

}
